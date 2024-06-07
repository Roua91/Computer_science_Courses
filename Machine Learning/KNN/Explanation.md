# K-Nearest Neighbors (KNN)

- **KNN Definition**:
  - A powerful classification algorithm used in pattern recognition.
  - Stores all available cases and classifies new cases based on a similarity measure (e.g., distance function).
  - Known for being a top data mining algorithm.
  - Non-parametric lazy learning algorithm, meaning it does not build an abstract model from the training data but uses the training data directly for classification.

- **Why is KNN called lazy?**:
  - No abstraction or generalization occurs.
  - Lazy learners do not summarize raw input into a model.
  - Classification is slow as it involves comparing the test sample with all training samples.
  - It's instance-based learning where the training data is stored and used directly.

### KNN: Classification Approach

- **Process**:
  - A new instance is classified by a majority vote of its nearest neighbors.
  - The new instance is assigned to the most common class among its K-nearest neighbors, determined by a distance function.

- **Historical Context**:
  - Nearest Neighbors method has been used in statistical estimation and pattern recognition since the 1970s.
  - It remains one of the top 10 Data Mining algorithms due to its simplicity and effectiveness.

### Technical Details

- **K-Nearest Neighbor Algorithm**:
  - Instances correspond to points in an n-dimensional feature space.
  - Each instance is represented by numerical attributes.
  - Training data consists of vectors and class labels.
  - Classification involves comparing feature vectors of K-nearest points.
  - Assigns the new instance to the most common class among its K-nearest neighbors.

### Distance Functions

- **Common Distance Metrics**:
  - **Euclidean Distance**:
    - Distance between two points $\(X = [x1, x2, ..., xn]\)$ and $\(Y = [y1, y2, ..., yn]\)$ is given by:
      $\[
      D(X, Y) = \sqrt{\sum_{i=1}^n (x_i - y_i)^2}
      \]$
  - **Manhattan Distance**:
    - Distance between two points $\(X = [x1, x2]\)$ and $\(Y = [y1, y2]\)$ is given by:
      $\[
      D(X, Y) = |x1 - y1| + |x2 - y2|
      \]$

### Choosing K

- **Impact of K**:
  - Small K values can be sensitive to noise and may lead to overfitting.
  - Larger K values reduce noise sensitivity but may include points from other classes, leading to underfitting.
  - The rule of thumb is to choose \(K < \sqrt{n}\), where \(n\) is the number of examples.

- **Bias and Variance**:
  - Small K results in high variance (overfitting) and low bias.
  - Large K results in low variance and high bias (underfitting).
  - Cross-validation is used to fine-tune the K value.

### Advantages and Disadvantages of KNN

- **Advantages**:
  - Can be applied to data from any distribution.
  - Simple and intuitive.
  - Good classification performance with a large number of samples.

- **Disadvantages**:
  - Dependent on the choice of K value.
  - Computationally expensive during the test stage as all computations are deferred until classification.
  - Requires a large number of samples for accurate classification.

### Summary

- KNN is a lazy, non-parametric algorithm that defers processing until classification.
- It uses a distance function to find the nearest neighbors and classify new instances based on majority vote.
- Choosing the right K value is crucial to balance bias and variance and achieve optimal performance.

### Class Activity Example

- Consider data with attributes {weight, size} and groups {Apple, Mangosteen}.
- Predict the type of fruit with given attributes using KNN by calculating distances and voting based on the nearest neighbors.

This summary covers the key points and technical details of the K-Nearest Neighbors (KNN) algorithm from the provided slides.
