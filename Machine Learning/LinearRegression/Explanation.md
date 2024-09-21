
### 1. Linear Regression Introduction**

Linear regression is a statistical method used to model the relationship between a dependent variable (often called the target or response) and one or more independent variables (called predictors or features). The goal is to find the best-fitting line (or hyperplane in higher dimensions) that predicts the dependent variable based on the independent variables.

For **simple linear regression** (one independent variable), the equation of the line is:
$y = \beta_0 + \beta_1 x + \epsilon\$
- $\(y\)$: Dependent variable (target or outcome)
- $\(x\)$: Independent variable (predictor or feature)
- $\(\beta_0\)$: Intercept (the value of \(y\) when \(x = 0\))
- $\(\beta_1\)$: Slope (rate of change of \(y\) with respect to \(x\))
- $\(\epsilon\)$: Error term (difference between observed and predicted values)

For **multiple linear regression** (multiple independent variables), the equation extends to:

$y = \beta_0 + \beta_1 x_1 + \beta_2 x_2 + ... + \beta_n x_n + \epsilon\$



### **2. Calculate the Predicted Values**

The model predicts \( \hat{y} \) (the estimate of \( y \)) for a given set of inputs \(x_1, x_2, ..., x_n\) using the formula:

$\hat{y} = \beta_0 + \beta_1 x_1 + \beta_2 x_2 + ... + \beta_n x_n\$

Our goal is to determine the values of the coefficients $(\(\beta_0, \beta_1, \dots, \beta_n\))$ that minimize the difference between the predicted values $(\(\hat{y}\))$ and the actual values $(\(y\))$.



### **3. Error Term and Cost Function**

The difference between the actual and predicted values is called the **residual**:
![image](https://github.com/user-attachments/assets/387ae357-81be-44ba-971f-8decba83de92)

$\text{Residual} = y - \hat{y}\$
In linear regression, we want to minimize the **sum of squared residuals** or the **cost function**, which is commonly called the **Mean Squared Error (MSE)**:

$$MSE = \frac{1}{n} \sum_{i=1}^{n} (y_i - \hat{y}_i)^2\$$

Where $\(n\)$ is the number of data points.

The aim is to minimize this MSE by adjusting the coefficients \(\beta_0, \beta_1, \dots, \beta_n\).



### **4. Solving for Coefficients (Ordinary Least Squares)**

The most common method for solving linear regression is **Ordinary Least Squares (OLS)**. Using OLS, we find the coefficients that minimize the MSE.

#### For **simple linear regression**, the formulas for \(\beta_0\) and \(\beta_1\) are:

$\beta_1 = \frac{\sum (x_i - \bar{x})(y_i - \bar{y})}{\sum (x_i - \bar{x})^2}\$


Where:
- $\(x_i\)$ and $\(y_i\)$ are individual data points.
- $\(\bar{x}\)$ and $\(\bar{y}\)$ are the means of $\(x\)$ and $\(y\)$.


$\beta_0 = \bar{y} - \beta_1 \bar{x}\$

#### For **multiple linear regression**, we use matrix algebra:
Let:

![image](https://github.com/user-attachments/assets/5c7050e7-3660-4e72-8999-16a55ee5339c)

Where $\(m\)$ is the number of observations, and $\(n\)$ is the number of features (including a column of ones for the intercept term).

The **OLS solution** is derived as:

$\boldsymbol{\beta} = (\mathbf{X}^T \mathbf{X})^{-1} \mathbf{X}^T \mathbf{y}\$

Where:
- $\(\mathbf{X}^T\)$ is the transpose of the matrix $\(\mathbf{X}\)$.
- $\((\mathbf{X}^T \mathbf{X})^{-1}\)$ is the inverse of the product of $\(\mathbf{X}^T\)$ and $\(\mathbf{X}\)$.

This equation provides the values of $\(\beta_0, \beta_1, \dots, \beta_n\)$.



### **5. Assess the Model**

Once the coefficients are computed, the next step is to assess the quality of the model. Some common metrics include:

- **R-squared**: Measures the proportion of the variance in the dependent variable that is predictable from the independent variables:
  
  $R^2 = 1 - \frac{\sum_{i=1}^n (y_i - \hat{y}_i)^2}{\sum_{i=1}^n (y_i - \bar{y})^2}\$
  
- **Adjusted R-squared**: Adjusts $\(R^2\)$ for the number of predictors in the model.



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

### Summary:

1. Define the problem with the linear model equation.
2. Calculate predicted values using the model.
3. Minimize the error term with the cost function (MSE).
4. Use OLS to solve for the best-fit coefficients.
5. Assess the model using metrics like \(R^2\).
6. Ensure assumptions are met.
7. Use regularization for complex models.


