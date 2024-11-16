# NUMERICAL OPTIMIZATION

# FEATURE SELECTION ====

library(randomForest)
library(caret)

# 1. Feature selection with correlation and random forest classification

# Compute correlation matrix 
corMatrix <- cor(trainData[, -5])
highCorFeatures <- findCorrelation(corMatrix, cutoff = .7)

# remove highly correlated variables
reducedTrainData <- trainData[, -highCorFeatures]

# random forest
model1 <- randomForest(Species ~ ., data=reducedTrainData)
print(model1)
reducedTestData <- testData[, -highCorFeatures]
pred1 <- predict(model1, reducedTestData)
confusionMatrix(pred1, testData$Species)

# 2. Recursive feature elimination (RFE) with random forest

# RFE
control2 <- rfeControl(functions=rfFuncs, method="cv", number=10)
results2 <- rfe(trainData[,1:4], trainData[,5], sizes=c(1:4), 
                rfeControl=control2)
print(results2)

# Random forest
model2 <- randomForest(Species ~ ., 
                       data=trainData[,c(results2$optVariables, "Species")])
pred2 <- predict(model2, testData[,c(results2$optVariables, "Species")])
confusionMatrix(pred2, testData$Species)


# FEATURE EXTRACTION ====
# PCA ==== 

data(mtcars) # Loading Data

# Need to scale / Normalize as PCA depends on distance measure
my_pca <- prcomp(mtcars, scale = TRUE, center = TRUE, retx = T)
names(my_pca)

summary(my_pca) # Summary
my_pca
my_pca$rotation # View the principal component loading
dim(my_pca$x) # See the principal components
my_pca$x

# Plotting the resultant principal components
# The parameter scale=0 ensures that arrows are scaled to represent the loadings
biplot(my_pca, main = "Biplot", scale = 0)

my_pca$sdev # Compute standard deviation
my_pca.var <- my_pca$sdev ^ 2 # Compute variance
propve <- my_pca.var / sum(my_pca.var) # Proportion of variance for scree plot

# Plot variance explained for each principal component
plot(propve, xlab = "principal component",
     ylab = "Proportion of Variance Explained",
     ylim = c(0, 1), type = "b", main = "Scree Plot")

# Plot the cumulative proportion of variance explained
plot(cumsum(propve), xlab = "Principal Component",
     ylab = "Cumulative Proportion of Variance Explained", 
     ylim = c(0, 1), type = "b")

# Find Top n principal component which will at least 
# cover 90% variance of dimension
which(cumsum(propve) >= 0.9)[1]

# Predict mpg using first 4 new Principal Components
# Add a training set with principal components
train.data <- data.frame(disp = mtcars$disp, my_pca$x[, 1:4])

# Running a Decision tree algporithm
library(rpart)
library(rpart.plot)
rpart.model <- rpart(disp ~ ., data = train.data, method = "anova")
rpart.plot(rpart.model)

# LINEAR DISCREMINANT ANALYSIS ==== 

library(MASS) 
library(tidyverse) 
library(caret) 
theme_set(theme_classic()) 
data("iris") # Load the data 

# Split the data into training (80%) and test set (20%) 
set.seed(123) 
training.individuals <- iris$Species %>% 
  createDataPartition(p = 0.8, list = FALSE) 
train.data <- iris[training.individuals, ] 
test.data <- iris[-training.individuals, ] 

# Estimate preprocessing parameters 
preproc.parameter <- train.data %>% preProcess(method = c("center", "scale")) 

# Transform the data using the estimated parameters 
train.transform <- preproc.parameter %>% predict(train.data) 
test.transform <- preproc.parameter %>% predict(test.data) 

model <- lda(Species~., data = train.transform) # Fit the model
predictions <- model %>% predict(test.transform) # Make predictions 
mean(predictions$class==test.transform$Species) # Model accuracy 
model <- lda(Species~., data = train.transform) 
model 
