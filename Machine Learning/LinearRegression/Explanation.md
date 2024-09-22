
### **1. Linear Regression Introduction**

Linear regression is a statistical method used to model the relationship between a dependent variable (often called the target or response) and one or more independent variables (called predictors or features). The goal is to find the best-fitting line (or hyperplane in higher dimensions) that predicts the dependent variable based on the independent variables.

The starting point for linear regression is the equation:


$$y = \beta_0 + \beta_1 x + \epsilon$$

Where:
- $\(y\)$ is the dependent variable (the target we want to predict),
- $\(x\)$ is the independent variable (the feature),
- $\(\beta_0\)$ is the intercept (the value of \(y\) when \(x = 0\)),
- $\(\beta_1\)$ is the slope (how much \(y\) changes for a unit change in \(x\)),
- $\(\epsilon\)$ is the error term (the difference between the predicted and actual values).

The goal is to find the best values for $\(\beta_0\)$ and $\(\beta_1\)$ (also known as **parameters**) so that the line best fits the data.

### 2. **Parameter Estimation**
The most common way to find $\(\beta_0\)$ and $\(\beta_1\)$ is by using the **Ordinary Least Squares (OLS)** method. OLS aims to minimize the sum of squared differences between the observed values of $\(y\)$ and the values predicted by the model. These differences are called **residuals**.

The formulas for estimating the parameters are derived by minimizing the squared residuals:

$$\hat{\beta_1} = \frac{\sum (x_i - \bar{x})(y_i - \bar{y})}{\sum (x_i - \bar{x})^2}$$


$$\hat{\beta_0} = \bar{y} - \hat{\beta_1} \bar{x}$$

Where:
- $\(\hat{\beta_1}\)$ and $\(\hat{\beta_0}\)$ are the estimated parameters,
- $\(\bar{x}\) and \(\bar{y}\)$ are the mean values of $\(x\)$ and $\(y\)$,
- $\(x_i\)$ and $\(y_i\)$ are the individual data points.

After calculating these values, you have an initial **fitted line** that describes the relationship between \(x\) and \(y\).



### **2. Calculate the Predicted Values**

The model predicts $\( \hat{y} \)$ (the estimate of \( y \)) for a given set of inputs $\(x_1, x_2, ..., x_n\)$ using the formula:

$$\hat{y} = \beta_0 + \beta_1 x_1 + \beta_2 x_2 + ... + \beta_n x_n\$$

Our goal is to determine the values of the coefficients $(\(\beta_0, \beta_1, \dots, \beta_n\))$ that minimize the difference between the predicted values $(\(\hat{y}\))$ and the actual values $(\(y\))$.



### **3. Error Term and Cost Function**

The difference between the actual and predicted values is called the **residual**:
![image](https://github.com/user-attachments/assets/387ae357-81be-44ba-971f-8decba83de92)

$\text{Residual} = y - \hat{y}\$
In linear regression, we want to minimize the **sum of squared residuals** or the **cost function**, which is commonly called the **Mean Squared Error (MSE)**:

$$MSE = \frac{1}{n} \sum_{i=1}^{n} (y_i - \hat{y}_i)^2\$$

Where $\(n\)$ is the number of data points.

The aim is to minimize this MSE by adjusting the coefficients \(\beta_0, \beta_1, \dots, \beta_n\).




### **4. Assess the Model**

Once the model is fitted, it's important to evaluate how well it predicts the dependent variable. In **linear regression**, there are two main categories of functions that are crucial to the learning process: **evaluation metrics** and **cost functions** . Here's a breakdown of the different types in each category:

### 1. **Evaluation Metrics** (Model Performance)

Evaluation metrics are used after training to **assess the model’s performance** on unseen (test) data. They provide insights into how well the model generalizes to new data and help compare different models.

#### **Common Evaluation Metrics in Linear Regression**:
1. **Mean Squared Error (MSE)**:
   
   $$MSE = \frac{1}{n} \sum_{i=1}^{n} (Y_i - \hat{Y}_i)^2$$
   - Used both as a cost function during training and an evaluation metric.
   - Measures the average squared difference between the actual and predicted values.

2. **Root Mean Squared Error (RMSE)**:
   
   $$RMSE = \sqrt{\frac{1}{n} \sum_{i=1}^{n} (Y_i - \hat{Y}_i)^2}$$
   - RMSE is often more interpretable than MSE since it’s in the same units as $\(Y\)$.
   - Used as an evaluation metric to provide insight into the average prediction error.

3. **Mean Absolute Error (MAE)**:
   
   $$MAE = \frac{1}{n} \sum_{i=1}^{n} |Y_i - \hat{Y}_i|$$
   - Provides the average magnitude of prediction errors without considering their direction (positive or negative).
   - Less sensitive to large errors than MSE and RMSE, making it a good choice when you want a more robust evaluation in the presence of outliers.

4. **R-squared (\(R^2\))**:

   $$R^2 = 1 - \frac{\sum_{i=1}^{n} (Y_i - \hat{Y}i)^2}{\sum{i=1}^{n} (Y_i - \bar{Y})^2}$$
   - Measures the proportion of variance in the dependent variable that is predictable from the independent variable(s).
   - \(R^2\) ranges from 0 to 1, with higher values indicating a better fit. An $\(R^2\)$ value of 1 means the model perfectly predicts all data points, while 0 means it predicts nothing better than the mean of the data.

6. **Adjusted R-squared**:
   
   $$\text{Adjusted } R^2 = 1 - \left(1 - R^2\right) \frac{n - 1}{n - k - 1}$$
   - Adjusted \(R^2\) accounts for the number of predictors in the model and adjusts the $\(R^2\$) value to penalize models that have too many predictors (i.e., models that overfit).
   - It is particularly useful when comparing models with different numbers of independent variables.


---

### **2. Cost Functions** (Optimization Objectives)
Cost functions are used during the training phase to **optimize** the model by minimizing the error. They measure how well the model fits the training data. The goal is to minimize these cost functions to find the best-fitting parameters for the model.

#### **Common Cost Functions in Linear Regression**:

1. **Sum of Squared Errors (SSE)**:
   
   $$SSE = \sum_{i=1}^{n} (Y_i - \hat{Y}_i)^2$$
   
   - This is the **total** squared difference between the actual values \(Y_i\) and predicted values \(\hat{Y}_i\).
   - Used as the objective function to minimize in Ordinary Least Squares (OLS).

3. **Mean Squared Error (MSE)**:
   
   $$MSE = \frac{1}{n} \sum_{i=1}^{n} (Y_i - \hat{Y}_i)^2$$
   
   - This is the **average** squared difference between the actual and predicted values.
   - While it is often used as an evaluation metric (see below), it can also be used as a cost function to minimize in gradient-based optimization techniques.

5. **Root Mean Squared Error (RMSE)**:
   
   $$RMSE = \sqrt{\frac{1}{n} \sum_{i=1}^{n} (Y_i - \hat{Y}_i)^2}$$
   
   - RMSE is the square root of the MSE and provides a more interpretable measure of the average error in the same units as $\(Y\)$.
   - Often used in practice as an evaluation metric, but can also be minimized as a cost function.

7. **Mean Absolute Error (MAE)**:
   
   $$MAE = \frac{1}{n} \sum_{i=1}^{n} |Y_i - \hat{Y}_i|$$
   
   - This is the average of the **absolute differences** between actual and predicted values.
   - MAE is sometimes used as an alternative to MSE because it is less sensitive to large outliers.

9. **Huber Loss**:
   
   $$L_\delta(Y, \hat{Y}) = 
   \begin{cases} 
      \frac{1}{2} (Y - \hat{Y})^2 & \text{for } |Y - \hat{Y}| \leq \delta \\
      \delta (|Y - \hat{Y}| - \frac{1}{2}\delta) & \text{for } |Y - \hat{Y}| > \delta
   \end{cases}$$
   - Huber Loss combines **MSE** and **MAE**. It behaves like MSE for small errors and like MAE for large errors, making it robust to outliers.

### Summary of Cost Functions and Evaluation Metrics in Linear Regression:
1. **Evaluation Metrics** (Used to assess model performance on test data):
   - Mean Squared Error (MSE)
   - Root Mean Squared Error (RMSE)
   - Mean Absolute Error (MAE)
   - $\(R^2\)$ (Coefficient of Determination)
   - Adjusted $\(R^2\)$

2. **Cost Functions** (Used to minimize the error during training):
   - Sum of Squared Errors (SSE)
   - Mean Squared Error (MSE)
   - Root Mean Squared Error (RMSE)
   - Mean Absolute Error (MAE)
   - Huber Loss




### **6. Assumptions of Linear Regression**

Linear regression works best when these assumptions are met:

1. **Linearity**: The relationship between the independent and dependent variables is linear.
2. **Independence**: Observations are independent of each other.
3. **Homoscedasticity**: The variance of residuals is constant across all levels of the independent variables.
4. **Normality**: Residuals are normally distributed.



### **7. Regularization (Advanced)**

To improve the model, especially when dealing with overfitting, you can use regularization techniques:

- **Ridge Regression**: Adds an $\(L2\)$ penalty to the cost function to penalize large coefficients:
  
  $\text{Cost function} = \sum_{i=1}^{n} (y_i - \hat{y}_i)^2 + \lambda \sum_{j=1}^{p} \beta_j^2\$
  
- **Lasso Regression**: Adds an \(L1\) penalty, encouraging sparse models (many coefficients become zero):
  \$\text{Cost function} = \sum_{i=1}^{n} (y_i - \hat{y}_i)^2 + \lambda \sum_{j=1}^{p} |\beta_j|\$


---

### Mathematical Example

#### Question:
Given the following data on house prices (in $1000) and the corresponding size of houses (in square feet):

| House Size (sq ft) $\(x\)$ | Price ($1000) $\(y\)$ |
|--------------------------|---------------------|
| 1400                      | 245                 |
| 1600                      | 312                 |
| 1700                      | 279                 |
| 1875                      | 308                 |
| 1100                      | 199                 |

Use **simple linear regression** to find the linear relationship between house size and price.

#### Step 1: Calculate the Means
First, calculate the means of \( x \) and \( y \):

$$\bar{x} = \frac{1400 + 1600 + 1700 + 1875 + 1100}{5} = 1535$$


$$\bar{y} = \frac{245 + 312 + 279 + 308 + 199}{5} = 268.6$$

#### Step 2: Calculate $\( \beta_1 \)$ (Slope)
Next, calculate $\( \beta_1 \)$:

$$\beta_1 = \frac{\sum (x_i - \bar{x})(y_i - \bar{y})}{\sum (x_i - \bar{x})^2}$$
First, calculate the individual components:

| $\(x_i\)$ | $\(y_i\)$ | $\(x_i - \bar{x}\)$ | $\(y_i - \bar{y}\)$ | $\((x_i - \bar{x})(y_i - \bar{y})\)$ | \$((x_i - \bar{x})^2\)$ |
|--------|---------|-------------------|-------------------|----------------------------------|----------------------|
| 1400   | 245     | -135              | -23.6             | 3186                             | 18225                |
| 1600   | 312     | 65                | 43.4              | 2821                             | 4225                 |
| 1700   | 279     | 165               | 10.4              | 1716                             | 27225                |
| 1875   | 308     | 340               | 39.4              | 13396                            | 115600               |
| 1100   | 199     | -435              | -69.6             | 30276                            | 189225               |

Sum the columns:

$$\sum (x_i - \bar{x})(y_i - \bar{y}) = 3186 + 2821 + 1716 + 13396 + 30276 = 51395$$



$$\sum (x_i - \bar{x})^2 = 18225 + 4225 + 27225 + 115600 + 189225 = 354500$$
Now, calculate the slope:

$$\beta_1 = \frac{51395}{354500} \approx 0.145$$

#### Step 3: Calculate \( \beta_0 \) (Intercept)
Now calculate \( \beta_0 \):

$$\beta_0 = \bar{y} - \beta_1 \bar{x}$$


$$\beta_0 = 268.6 - (0.145)(1535) = 268.6 - 222.575 = 46.025$$



#### Step 4: Form the Linear Equation
The linear regression equation is:

$$y = 46.025 + 0.145x$$

This means that for every additional square foot, the house price increases by approximately $0.145 (or $145 if scaled back to normal units).

---


### Summary:

1. Define the problem with the linear model equation.
2. Calculate predicted values using the model.
3. Minimize the error term with the cost function (MSE).
4. Use OLS to solve for the best-fit coefficients.
5. Assess the model using metrics like $\(R^2\)$.
6. Ensure assumptions are met.
7. Use regularization for complex models.


