## K-Means Clustering Algorithm

### Introduction
K-Means is one of the simplest and most popular unsupervised machine learning algorithms used for clustering. Clustering involves grouping a set of objects in such a way that objects in the same group (called a cluster) are more similar to each other than to those in other groups.

### Steps of the K-Means Algorithm

1. **Initialization**:
   - Choose the number of clusters \( k \).
   - Initialize \( k \) cluster centroids randomly or using a specific method (e.g., k-means++).

2. **Assignment**:
   - Assign each data point to the nearest cluster centroid based on a distance metric (usually Euclidean distance).
   - This step creates \( k \) clusters.

3. **Update**:
   - Calculate the new centroids by taking the mean of all the data points assigned to each cluster.
   
4. **Convergence**:
   - Repeat the assignment and update steps until the centroids no longer change significantly or a maximum number of iterations is reached.
   - The algorithm converges when the assignments no longer change.

### Detailed Steps

1. **Initialization**:
   - Let's say we have \( n \) data points and we want to cluster them into \( k \) clusters.
   - Randomly select \( k \) points from the dataset as the initial centroids.

2. **Assignment Step**:
   - For each data point, calculate the distance to each centroid.
   - Assign the data point to the cluster with the nearest centroid.
   - This results in \( k \) clusters.

3. **Update Step**:
   - For each cluster, compute the new centroid by taking the mean of all the data points in that cluster.
   - The new centroid is calculated as:
     \[
     \mu_j = \frac{1}{|C_j|} \sum_{x_i \in C_j} x_i
     \]
     where \( \mu_j \) is the centroid of cluster \( j \), \( C_j \) is the set of points in cluster \( j \), and \( x_i \) is a data point in \( C_j \).

4. **Convergence**:
   - Repeat the assignment and update steps until the centroids no longer move significantly or the algorithm reaches a predetermined number of iterations.
   - Convergence can be checked by measuring the changes in the centroids or the overall clustering cost.


### Considerations

- **Choosing \( k \)**: The number of clusters \( k \) is a hyperparameter that must be chosen before running the algorithm. Methods such as the elbow method or silhouette analysis can help determine the appropriate number of clusters.
- **Distance Metric**: The choice of distance metric (e.g., Euclidean distance) can affect the outcome of the clustering.
- **Initialization**: Different initializations can lead to different final clusters. K-means++ is an initialization method that aims to improve the quality of the initial centroids.
- **Convergence**: K-Means may converge to a local minimum, and the final result can depend on the initial centroids.

### Advantages and Disadvantages

**Advantages**:
- Simple and easy to implement.
- Efficient for large datasets.
- Works well when clusters are spherical and well-separated.

**Disadvantages**:
- Requires the number of clusters \( k \) to be specified.
- Sensitive to the initial placement of centroids.
- Assumes clusters are spherical and of similar size.

### Applications

K-Means is widely used in various fields, including:
- Customer segmentation in marketing.
- Image compression.
- Document clustering.
- Anomaly detection.




# K-Means Clustering Example

## Data Points
| Point | x1 | x2 |
|-------|----|----|
| x1    | 2  | 3  |
| x2    | 3  | 3  |
| x3    | 6  | 8  |
| x4    | 8  | 8  |
| x5    | 7  | 9  |
| x6    | 9  | 7  |

## Initial Centroids
- **Centroid 1 (μ1):** (2, 3)
- **Centroid 2 (μ2):** (9, 7)

## Steps

### Step 1: Initialize Centroids
- μ1 = (2, 3)
- μ2 = (9, 7)

### Step 2: Assign Data Points to Closest Centroid
Calculate the Euclidean distance between each data point and the centroids. Assign each point to the nearest centroid.

For $\( x_1 = (2, 3) \)$:
$\[
d(x_1, \mu_1) = \sqrt{(2-2)^2 + (3-3)^2} = 0
\]$
$\[
d(x_1, \mu_2) = \sqrt{(2-9)^2 + (3-7)^2} = \sqrt{49 + 16} = \sqrt{65}
\]$
Assign $\( x_1 \)$ to $\( \mu_1 \)$.

For $\( x_2 = (3, 3) \)$:
$\[
d(x_2, \mu_1) = \sqrt{(3-2)^2 + (3-3)^2} = \sqrt{1} = 1
\]$
$\[
d(x_2, \mu_2) = \sqrt{(3-9)^2 + (3-7)^2} = \sqrt{36 + 16} = \sqrt{52}
\]$
Assign $\( x_2 \)$ to $\( \mu_1 \)$.

For $\( x_3 = (6, 8) \)$:
$\[
d(x_3, \mu_1) = \sqrt{(6-2)^2 + (8-3)^2} = \sqrt{16 + 25} = \sqrt{41}
\]$
$\[
d(x_3, \mu_2) = \sqrt{(6-9)^2 + (8-7)^2} = \sqrt{9 + 1} = \sqrt{10}
\]$
Assign $\( x_3 \)$ to $\( \mu_2 \)$.

For $\( x_4 = (8, 8) \)$:
$\[
d(x_4, \mu_1) = \sqrt{(8-2)^2 + (8-3)^2} = \sqrt{36 + 25} = \sqrt{61}
\]$
$\[
d(x_4, \mu_2) = \sqrt{(8-9)^2 + (8-7)^2} = \sqrt{1 + 1} = \sqrt{2}
\]$
Assign $\( x_4 \)$ to $\( \mu_2 \)$.

For $\( x_5 = (7, 9) \)$:
$\[
d(x_5, \mu_1) = \sqrt{(7-2)^2 + (9-3)^2} = \sqrt{25 + 36} = \sqrt{61}
\]$
$\[
d(x_5, \mu_2) = \sqrt{(7-9)^2 + (9-7)^2} = \sqrt{4 + 4} = \sqrt{8}
\]$
Assign $\( x_5 \)$ to $\( \mu_2 \)$.

For $\( x_6 = (9, 7) \)$:
$\[
d(x_6, \mu_1) = \sqrt{(9-2)^2 + (7-3)^2} = \sqrt{49 + 16} = \sqrt{65}
\]$
$\[
d(x_6, \mu_2) = \sqrt{(9-9)^2 + (7-7)^2} = 0
\]$
Assign $\( x_6 \) to \( \mu_2 \)$.

| Point | Distance to μ1 | Distance to μ2 | Assigned to |
|-------|----------------|----------------|-------------|
| x1    | 0              | √65            | μ1          |
| x2    | 1              | √52            | μ1          |
| x3    | √41            | √10            | μ2          |
| x4    | √61            | √2             | μ2          |
| x5    | √61            | √8             | μ2          |
| x6    | √65            | 0              | μ2          |

### Step 3: Recompute Centroids
Recompute the centroids based on the current assignments.

![image](https://github.com/Roua91/Computer_science_Courses/assets/165356652/faf058d6-19e4-4b67-acc7-a2a1cb13927b)


- New μ1: (2.5, 3)
- New μ2: (7.5, 8)

### Step 4: Repeat Assignment and Update
Repeat the assignment step with the new centroids and recompute until convergence.

**Assignment:**

For $\( x_1 = (2, 3) \)$:
$\[
d(x_1, \mu_1) = \sqrt{(2-2.5)^2 + (3-3)^2} = \sqrt{0.25} = 0.5
\]$
$\[
d(x_1, \mu_2) = \sqrt{(2-7.5)^2 + (3-8)^2} = \sqrt{30.25 + 25} = \sqrt{55.25}
\]$
Assign $\( x_1 \)$ to $\( \mu_1 \)$.

For $\( x_2 = (3, 3) \)$:
$\[
d(x_2, \mu_1) = \sqrt{(3-2.5)^2 + (3-3)^2} = \sqrt{0.25} = 0.5
\]$
$\[
d(x_2, \mu_2) = \sqrt{(3-7.5)^2 + (3-8)^2} = \sqrt{20.25 + 25} = \sqrt{45.25}
\]$
Assign $\( x_2 \)$ to $\( \mu_1 \)$.

For $\( x_3 = (6, 8) \)$:
$\[
d(x_3, \mu_1) = \sqrt{(6-2.5)^2 + (8-3)^2} = \sqrt{12.25 + 25} = \sqrt{37.25}
\]$
$\[
d(x_3, \mu_2) = \sqrt{(6-7.5)^2 + (8-8)^2} = \sqrt{2.25} = 1.5
\]$
Assign $\( x_3 \) to \( \mu_2 \)$.

For $\( x_4 = (8, 8) \)$:
$\[
d(x_4, \mu_1) = \sqrt{(8-2.5)^2 + (8-3)^2} = \sqrt{30.25 + 25} = \sqrt{55.25}
\]$
$\[
d(x_4, \mu_2) = \sqrt{(8-7.5)^2 + (8-8)^2} = \sqrt{0.25} = 0.5
\]$
Assign $\( x_4 \) to \( \mu_2 \)$.

For $\( x_5 = (7, 9) \)$:
$\[
d(x_5, \mu_1) = \sqrt{(7-2.5)^2 + (9-3)^2} = \sqrt{20.25 + 36} = \sqrt{56.25}
\]$
$\[
d(x_5, \mu_2) = \sqrt{(7-7.5)^2 + (9-8)^2} = \sqrt{0.25 + 1} = \sqrt{1.25}
\]$
Assign $\( x_5 \) to \( \mu_2 \)$.

For $\( x_6 = (9, 7) \)$:
$\[
d(x_6, \mu_1) = \sqrt{(9-2.5)^2 + (7-3)^2} = \sqrt{42.25 + 16} = \sqrt{58.25}
\]$
$\[
d(x_6, \mu_2) = \sqrt{(9-7.5)^2 + (7-8)^2} = \sqrt{2.25 + 1} = \sqrt{3.25}
\]$
Assign $\( x_6 \) to \( \mu_2 \)$.

| Point | Distance to new μ1 | Distance to new μ2 | Assigned to |
|-------|---------------------|--------------------|-------------|
| x1    | 0.5                 | √55.25             | μ1          |
| x2    | 0.5                 | √45.25             | μ1          |
| x3    | √37.25              | 1.5                | μ2          |
| x4    | √55.25              | 0.5                | μ2          |
| x5    | √56.25              | √1.25              | μ2          |
| x6    | √58.25              | √3.25              | μ2          |

Since the centroids did not change, the algorithm has converged.

**Recompute Centroids:**

![image](https://github.com/Roua91/Computer_science_Courses/assets/165356652/50488c0a-2bb5-4794-af54-c4ebf6466796)

Since the centroids did not change, the algorithm has converged.


### Final Result
- **Centroid 1 (μ1):** (2.5, 3)
- **Centroid 2 (μ2):** (7.5, 8)

### Cluster Assignments
- **Cluster 1 (μ1):** x1, x2
- **Cluster 2 (μ2):** x3, x4, x5, x6

