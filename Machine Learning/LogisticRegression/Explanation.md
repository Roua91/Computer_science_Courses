### 1. **Introduction to Binary Classification**
Logistic regression is primarily used for **binary classification**. For example, we might want to classify if:
- An image contains a **cat** or not.
- A customer will **switch insurance** or not.

In binary classification, there are two possible classes or outcomes:
- Class 1 (e.g., “Yes” or “1”)
- Class 0 (e.g., “No” or “0”)

We use **logistic regression** to predict the **probability** that an observation belongs to class 1, based on a set of features (inputs). The predicted probability will range between 0 and 1.

### 2. **Notation**
- Let **\( y \)** be the actual class (either 0 or 1). 
- **\( x \)** is the input vector that contains the features (e.g., age, height, or pixels from an image).
- We want to predict the probability **\( P(y = 1 | x) \)**, which means the probability that \( y \) is 1 (the observation belongs to class 1) given the features \( x \).

### 3. **Linear Combination of Features**
Before applying the logistic function, we compute a **linear combination** of the features. This is similar to **linear regression**.

The linear combination of the features looks like this:

$\[
z = \beta_0 + \beta_1 x_1 + \beta_2 x_2 + \dots + \beta_n x_n
\]$

Here:
- \( \beta_0 \) is the **bias** (a constant term).
- \( \beta_1, \beta_2, \dots, \beta_n \) are the **weights** (parameters that the model learns).
- \( x_1, x_2, \dots, x_n \) are the **input features** (e.g., age, income, or any other measurable data).

### 4. **Logistic (Sigmoid) Function**
The logistic function transforms the linear combination \( z \) into a **probability** value. This is where logistic regression gets its name.

The logistic function is defined as:

\[
P(y = 1 | x) = \frac{1}{1 + e^{-z}}
\]

Where:
- \( z \) is the linear combination we computed earlier.
- \( e \) is the mathematical constant (approximately 2.718).

The output of this function is always between 0 and 1, representing a probability.

### 5. **Decision Boundary**
To classify a new observation:
- If the predicted probability **\( P(y = 1 | x) \)** is greater than **0.5**, we classify it as **class 1**.
- If the predicted probability is less than **0.5**, we classify it as **class 0**.

This threshold can be adjusted, but 0.5 is the most common choice.

### 6. **Cost Function**
To train the model (i.e., to find the optimal values of \( \beta_0, \beta_1, \dots, \beta_n \)), we need to define a **cost function**. The cost function tells us how well our model is doing.

For logistic regression, we use **cross-entropy** as the cost function:

\[
J(\beta) = -\frac{1}{m} \sum_{i=1}^{m} \left[ y^{(i)} \log(h_{\beta}(x^{(i)})) + (1 - y^{(i)}) \log(1 - h_{\beta}(x^{(i)})) \right]
\]

Where:
- \( m \) is the number of training examples.
- \( y^{(i)} \) is the actual label for the \( i \)-th example (either 0 or 1).
- \( h_{\beta}(x^{(i)}) \) is the predicted probability for the \( i \)-th example.
- The summation is over all training examples.

This cost function penalizes wrong predictions more heavily and ensures the model converges to the best set of parameters.

### 7. **Gradient Descent**
To minimize the cost function and find the optimal parameters \( \beta_0, \beta_1, \dots, \beta_n \), we use **gradient descent**.

Gradient descent is an optimization algorithm that updates the parameters step by step to reduce the cost. It works by calculating the **partial derivatives** of the cost function with respect to each parameter and updating the parameters accordingly.

The update rule for the parameters is:

\[
\beta_j := \beta_j - \alpha \frac{\partial J(\beta)}{\partial \beta_j}
\]

Where:
- \( \alpha \) is the **learning rate**, a small positive number that controls how big the steps are.
- \( \frac{\partial J(\beta)}{\partial \beta_j} \) is the derivative of the cost function with respect to the parameter \( \beta_j \).

This process is repeated until the cost function reaches its minimum.

### 8. **Partial Derivatives**
To implement gradient descent, we need to compute the **gradients** (partial derivatives) of the cost function with respect to the parameters \( \beta_j \). Using calculus (specifically the **chain rule**), we derive the following:

For the weights \( \beta_j \) (for \( j \geq 1 \)):

\[
\frac{\partial J(\beta)}{\partial \beta_j} = \frac{1}{m} \sum_{i=1}^{m} \left( h_{\beta}(x^{(i)}) - y^{(i)} \right) x_j^{(i)}
\]

For the bias term \( \beta_0 \):

\[
\frac{\partial J(\beta)}{\partial \beta_0} = \frac{1}{m} \sum_{i=1}^{m} \left( h_{\beta}(x^{(i)}) - y^{(i)} \right)
\]

### 9. **Gradient Descent Update Rules**
Using these derivatives, we can update the parameters during each step of gradient descent:

\[
\beta_j := \beta_j - \alpha \frac{1}{m} \sum_{i=1}^{m} \left( h_{\beta}(x^{(i)}) - y^{(i)} \right) x_j^{(i)}
\]

\[
\beta_0 := \beta_0 - \alpha \frac{1}{m} \sum_{i=1}^{m} \left( h_{\beta}(x^{(i)}) - y^{(i)} \right)
\]

### 10. **Generalizing for Multiple Training Examples**
To handle multiple training examples at once, we vectorize our computations (using matrices instead of individual numbers). Let:
- **\( X \)** be a matrix containing all training examples.
- **\( \beta \)** be a vector of weights.

Then, the linear combination for all training examples is:

\[
z = X \beta
\]

And the predicted probabilities for all examples are:

\[
h_{\beta}(X) = \frac{1}{1 + e^{-X \beta}}
\]

This allows us to perform efficient computation using matrix operations, especially when we have large datasets.

### Summary
- **Logistic regression** predicts probabilities for binary classification.
- It uses the **logistic function** (sigmoid function) to convert a linear combination of features into a probability.
- The model is trained using a **cost function** (cross-entropy) and **gradient descent** to find the best parameters.
- **Gradient descent** updates the parameters step by step, minimizing the cost function to improve predictions.
