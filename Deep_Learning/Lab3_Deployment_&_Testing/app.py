from flask import Flask, render_template, request, jsonify
from tensorflow.keras.models import load_model
import numpy as np
import cv2

# Initialize Flask app
app = Flask(__name__)

# Load the trained model
MODEL_PATH = "saved_models/dnn_model.h5"  
model = load_model(MODEL_PATH)


def preprocess_image(file):
    """
    Preprocesses an uploaded file for the model:
    - Converts to grayscale.
    - Resizes to 28x28.
    - Normalizes and inverts pixel values.
    """
    import cv2
    import numpy as np

    # Read the image from the uploaded file
    file_bytes = np.frombuffer(file.read(), np.uint8)
    img = cv2.imdecode(file_bytes, cv2.IMREAD_GRAYSCALE)  # Load image in grayscale

    if img is None:
        raise ValueError("Invalid image file. Could not load.")

    # Threshold the image to isolate the digit (binary image)
    _, img_thresh = cv2.threshold(img, 127, 255, cv2.THRESH_BINARY_INV)

    # Find contours to detect the bounding box of the digit
    contours, _ = cv2.findContours(img_thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
    if len(contours) == 0:
        raise ValueError("No contours found in the image.")

    # Get the largest contour (assuming it's the digit)
    largest_contour = max(contours, key=cv2.contourArea)
    x, y, w, h = cv2.boundingRect(largest_contour)

    # Crop the image to the bounding box of the digit
    img_cropped = img[y:y+h, x:x+w]

    # Resize the cropped digit to 28x28
    img_resized = cv2.resize(img_cropped, (28, 28), interpolation=cv2.INTER_AREA)

    # Normalize pixel values to [0, 1]
    img_normalized = img_resized / 255.0

    # Invert colors (MNIST format: white digit on black background)
    img_processed = 1 - img_normalized

    # Add batch and channel dimensions to match the model's expected input
    img_processed = np.expand_dims(img_processed, axis=-1)  # Add channel dimension
    img_processed = np.expand_dims(img_processed, axis=0)   # Add batch dimension

    return img_processed


# Home route
@app.route("/")
def index():
    return render_template("DNN_html.html")

# Prediction route
@app.route("/predict", methods=["POST"])
def predict():
    """
    Flask route for digit prediction. Accepts an uploaded image file.
    """
    if "file" not in request.files:
        return jsonify({"error": "No file uploaded"}), 400

    file = request.files["file"]
    try:
        # Preprocess the uploaded image
        processed_image = preprocess_image(file)

        # Predict the digit using the model
        prediction = model.predict(processed_image)
        predicted_digit = np.argmax(prediction, axis=1)[0]

        return jsonify({"prediction": int(predicted_digit)})
    except ValueError as e:
        return jsonify({"error": str(e)}), 400
    except Exception as e:
        return jsonify({"error": "An unexpected error occurred: " + str(e)}), 500


if __name__ == "__main__":
    app.run(debug=True)
