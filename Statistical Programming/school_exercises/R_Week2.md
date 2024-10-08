---
title: "R Notebook"
output: html_notebook
---

# Data Structures in R

#### Data Types:

-   Numeric

-   Integer

-   Logical

-   Character

-   Complex

#### Data Structures:

1.  Data frame

2.  Factors

3.  Vector

4.  Matrix

5.  Arrays

6.  List

    ## Data Frame

**Creating a dataframe**

Note: The variable should be of the same length (same \# of elements)

```{r}
#Create a dataframe using data.frame() function
friend.data <- data.frame(
  friend_id = c(1:5),
  friend_name = c("Ava", "Diana", "David", "thomas", "Adam"),
  stringsAsFactors = FALSE
)

# Print the data frame
print(friend.data)
```

**str() function:** return the structure of the data.frame

```{r}
print(str(friend.data))
```

**summary() function:** return the statistical summary and nature of data

```{r}
print(summary(friend.data))
```

Extract a colomn using

```{r}
result <- data.frame(friend.data$friend_name)
print(result)
```

```{r}
first <-data.frame(friend.data$friend_name[1])
print(first)
```

```{r}
friend.data$friend_name[1]
```

### Expanding the data frame

A dataframe can be expanded by adding new columns and rows to the already existing dataframe

```{r}
friend.data$location<- c("Northwich", "London", "Bringham", "Sheffield", "Nottingham")

resultant <- friend.data

print(resultant)
```

### Factors

Factors are variables. They are implemented to categorize the data or represent catigoral data.

they can be stored as integers with corresponding labels

#### Atrributes of the factors

-   Levels

-   x: is the vector that needs to be converted into a factor

-   labels: It's a character

-   Exclude

-   Ordered

-   nmax

**factor() function:** to create a factor

```{r}
#this is a vector
x <- c("female", "female", "male", "male")
print(x)

#This is the factor
gender <- factor(x)
print(gender)
```

levels can also be predefined by the programmer

```{r}
gender <- factor(c("female", "female", "male", "male"), levels = c("female", "male"))

gender
```

**levels() function:** return the levels of the factor

```{r}
print(levels(gender))
```

**is.factor() function:** to check weather the variable is a factor

```{r}
print(is.factor(gender))
```

**class() function:** is also used to check whether the variable is a factor

```{r}
class(gender)
```

**Accessing the elements of factor**

```{r}
gender[3]
```

```{r}
#Accessing the second and the forth element
gender[c(2,4)]
```

```{r}
gender[-3]
#it will list the first 3 elemnts in the factor
```

#### **Modify the factor**

```{r}
gender[2] <- "male"
gender
```

#### Factors in Data frame

```{r}
age <- c(42, 48,49, 40, 52, 58, 53)
salary <- c(10230, 10620, 15020, 8609, 12390, 14070, 10200)
gender<- c("female", "male", "male", "female", "male", "female", "male")

employee<- data.frame(age, salary, gender)
print(employee)
```

```{r}
#check if the dataframe contain factors
print(is.factor(employee$gender))
```

## 3 Vectors

hold multiple data values of the same data type

indexing will start from 1

Types of vector: Numeric, character, logical

**Numeric vector**

```{r}
vector_1 <- c(4,5, 6)

#display the type of vector
typeof(vector_1)
```

```{r}
#use L to specidy that we want integer
vector_2 <- c(1L, 3L, 5L, 6L)

typeof(vector_2)
```

**Character Vector**

```{r}
vector_3<- c('world', '8', 'hello', 57)

typeof(vector_3)
```

**Logical Vector**

```{r}
vector_4 <- c(FALSE, FALSE, TRUE, NA)
typeof(vector_4)
```

### Creating a vector 

There's three ways to create a vector

```{r}
X <- c(61, 7, 21, 77, 34, 5)
cat("using c function", X, '\n')

Y<- seq(1,10, length.out = 5)
cat("using seq() finction ", Y, '\n')

Z<- 2:7
cat("using colon", Z)
```

**Accessing vector elements**

```{r}
X <- c(61, 7, 21, 77, 34, 5)
cat("using c function", X[2], '\n')

Y<- seq(1,10, length.out = 5)
cat("using seq() finction ", Y[c(4,1)], '\n')

Z<- 2:7
cat("using colon", Z[Z>4])
```

**Modifying vector**

```{r}
X <- c(61, 7, 21, 77, 34, 5)

#modify specific element
X[3]<-1
X[2]<-3
cat("using c function", X, '\n')
```

```{r}
#modify using different logic
X[X>5]<-0
cat("logical indexing", X, "\n")
```

```{r}
#modify by specifying the position or the element 
X<-X[c(3,2,1)]
cat("combine function", X)
```

**deleting a vector**

The process of deleting all the elements in the vector

```{r}
V<- c(8,11, 3,5)

V<- NULL

cat("output vector", V)
```

**Sorting element of a vector**

**sort() function:** sort the values in ascending or descending order

```{r}
X<- c(5, 7, 2, 33, 2)

A <- sort(X)
cat("ascending order", A, '\n')
```

```{r}
B <- sort(X, decreasing = TRUE)
cat("Descending order", B)
```

## 4 list 

\* Will not be included in the lab exercise

### Creating a List 

```{r}
emp_id <- c(1,2,3,4)

emp_name = c("Thomas", "Sendra", "Haris", "Sofia")

num_of_employe = 4

emp_list = list(
  "ID" = emp_id,
  "Name" = emp_name,
  "total staff" = num_of_employee
)
```
