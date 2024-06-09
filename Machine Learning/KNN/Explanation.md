# K-Nearest Neighbors (KNN)

- **KNN Definition**:
  - A powerful classification algorithm used in pattern recognition.
  - Stores all available cases and classifies new cases based on a similarity measure (e.g., distance function).
  - Known for being a top data mining algorithm.
  - Non-parametric lazy learning algorithm, meaning it does not build an abstract model from the training data but uses the training data directly for classification.
    
- **KNN different names:**
    • K-Nearest Neighbors
    • Memory-Based Reasoning
    • Example-Based Reasoning
    • Instance-Based Learning
    • Lazy Learning


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
      
      $$D(X, Y) = \sqrt{\sum_{i=1}^n (x_i - y_i)^2}$$
      
  - **Manhattan Distance**:
    - Distance between two points $\(X = [x1, x2]\)$ and $\(Y = [y1, y2]\)$ is given by:
      
      $$D(X, Y) = |x1 - y1| + |x2 - y2|$$

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

Certainly! Let's go through an example of calculating the distance between points using the Euclidean distance formula in the context of K-Nearest Neighbors (KNN).

### Example: Calculating Euclidean Distance

Let's consider a dataset with two features: age and income. We have the following points in our dataset:

| Point | Age | Income (in $1000s) | Class |
|-------|-----|--------------------|-------|
| A     | 25  | 40                 | 0     |
| B     | 30  | 60                 | 1     |
| C     | 35  | 70                 | 0     |
| D     | 40  | 80                 | 1     |

Now, we have a new point \( E \) with the following attributes:

| Point | Age | Income (in $1000s) |
|-------|-----|--------------------|
| E     | 28  | 50                 |

We need to calculate the Euclidean distance between point $\( E \)$ and all the points in our dataset.

### Euclidean Distance Formula

The Euclidean distance between two points $\( (x_1, y_1) \)$ and $\( (x_2, y_2) \)$ in a 2-dimensional space is given by:

$$ \text{distance} = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2} $$

### Calculations

1. **Distance between E and A**:
   $$\text{distance}_{EA} = \sqrt{(28 - 25)^2 + (50 - 40)^2} = \sqrt{3^2 + 10^2} = \sqrt{9 + 100} = \sqrt{109} \approx 10.44$$

2. **Distance between E and B**:
   $$\text{distance}_{EB} = \sqrt{(28 - 30)^2 + (50 - 60)^2} = \sqrt{(-2)^2 + (-10)^2} = \sqrt{4 + 100} = \sqrt{104} \approx 10.20$$

3. **Distance between E and C**:
   $$\text{distance}_{EC} = \sqrt{(28 - 35)^2 + (50 - 70)^2} = \sqrt{(-7)^2 + (-20)^2} = \sqrt{49 + 400} = \sqrt{449} \approx 21.19$$

4. **Distance between E and D**:
   $$\text{distance}_{ED} = \sqrt{(28 - 40)^2 + (50 - 80)^2} = \sqrt{(-12)^2 + (-30)^2} = \sqrt{144 + 900} = \sqrt{1044} \approx 32.31$$

### Summary of Distances

| Point | Distance to E |
|-------|---------------|
| A     | 10.44         |
| B     | 10.20         |
| C     | 21.19         |
| D     | 32.31         |

Based on these calculations, the closest points to \( E \) are \( B \) and \( A \).

### KNN Classification

If we are using $\( k = 3 \)$ for our KNN algorithm, we would consider the three closest points to $\( E \)$ (A, B, and C in this case). We would then classify $\( E \)$ based on the majority class among these three points.

- Class of A: 0
- Class of B: 1
- Class of C: 0

The majority class is 0, so point $\( E \)$ would be classified as class 0.
![image](https://github.com/Roua91/Computer_science_Courses/assets/165356652/419c494d-8fab-4cc3-89c8-22e794acc42a)

