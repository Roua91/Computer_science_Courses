# Numpy Cheat Sheet

| **Category**            | **Method**                          | **Description**                                                                 |
|--------------------------|--------------------------------------|---------------------------------------------------------------------------------|
| **Array Creation**       | `np.array(data)`                   | Creates a NumPy array from a list or tuple.                                     |
|                          | `np.zeros(shape)`                  | Generates an array filled with zeros.                                          |
|                          | `np.ones(shape)`                   | Creates an array filled with ones.                                             |
|                          | `np.arange(start, stop, step)`     | Creates a range of values as an array.                                         |
|                          | `np.linspace(start, stop, num)`    | Generates evenly spaced values between `start` and `stop`.                     |
| **Random Generation**    | `np.random.seed(seed)`             | Sets the random seed for reproducibility.                                       |
|                          | `np.random.rand(shape)`            | Generates random values in the range [0, 1).                                   |
|                          | `np.random.randint(low, high, size)` | Creates an array of random integers between `low` and `high`.                  |
|                          | `np.random.randn(shape)`           | Generates samples from a standard normal distribution (mean=0, std=1).         |
|                          | `np.random.choice(array, size)`    | Randomly selects elements from an array.                                       |
| **Array Manipulation**   | `np.reshape(array, new_shape)`     | Reshapes an array without changing its data.                                   |
|                          | `np.transpose(array)`              | Swaps rows and columns of a matrix.                                            |
|                          | `np.concatenate((a, b), axis)`     | Joins arrays along a specified axis.                                           |
|                          | `np.flatten()`                     | Converts a multi-dimensional array into a 1D array.                            |
| **Mathematical Ops**     | `np.add(a, b)`                     | Element-wise addition.                                                         |
|                          | `np.multiply(a, b)`                | Element-wise multiplication.                                                   |
|                          | `np.dot(a, b)`                     | Dot product of two arrays.                                                     |
|                          | `np.sqrt(array)`                   | Element-wise square root.                                                      |
|                          | `np.exp(array)`                    | Element-wise exponential.                                                      |
| **Statistical Ops**      | `np.mean(array)`                   | Computes the mean of elements.                                                 |
|                          | `np.median(array)`                 | Computes the median of elements.                                               |
|                          | `np.std(array)`                    | Computes the standard deviation.                                               |
|                          | `np.sum(array, axis)`              | Sum of elements along an axis.                                                 |
|                          | `np.max(array)`                    | Finds the maximum value.                                                       |
| **Logical Operations**   | `np.where(condition, x, y)`        | Selects elements based on a condition.                                         |
|                          | `np.all(array)`                    | Checks if all elements are true.                                               |
|                          | `np.any(array)`                    | Checks if any element is true.                                                 |
| **Utilities**            | `np.copy(array)`                   | Creates a copy of the array.                                                   |
|                          | `np.sort(array)`                   | Sorts the array.                                                               |
|                          | `np.unique(array)`                 | Finds unique elements in the array.                                            |
|                          | `np.isfinite(array)`               | Checks for finite values in the array.                                         |
