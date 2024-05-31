# Frequency count 
### Frequency Count for Loops

**Example: Simple Loop**

```java
public class SimpleLoop {
    public static void main(String[] args) {
        int n = 10; // 1
        for (int i = 0; i < n; i++) { // n+1 for initialization, n+1 for condition check
            System.out.println(i); // n
        }
    }
}
```

**Explanation**:
- `int n = 10;` executes once 1.
- `for (int i = 0; i < n; i++)` initialization executes once (n+1), condition check executes (n+1) times, and increment executes (n) times.
- `System.out.println(i);` executes `n` times.\

### Frequency Count for Nested Loops

**Example: Nested Loop**

```java
public class NestedLoop {
    public static void main(String[] args) {
        int n = 10; // 1
        for (int i = 0; i < n; i++) { // n+1 for condition check
            for (int j = 0; j < n; j++) { // n * (n+1) 
                System.out.println(i + ", " + j); // n * n
            }
        }
    }
}
```

**Explanation**:
- Outer loop initialization, condition check, and increment: `n+1`, `n+1`, `n`.
- Inner loop executes for each iteration of the outer loop:
  - Initialization: `n * (n+1)`
  - Condition check: `n * (n+1)`
  - Increment: `n * n`
  - `System.out.println(i + ", " + j);` executes `n * n` times.\

### Frequency Count for Recursive Function

**Example: Recursive Function (Factorial)**

```java
public class RecursiveFunction {
    public static void main(String[] args) {
        int n = 5; // 1
        System.out.println(factorial(n)); // 1
    }

    public static int factorial(int n) {
        if (n <= 1) { // n+1
            return 1; // n (base case)
        } else {
            return n * factorial(n - 1); // T(n) = T(n-1) + 1 (recursive call)
        }
    }
}
```

**Explanation**:
- `int n = 5;` and `System.out.println(factorial(n));` execute once (n+1).
- `if (n <= 1)` executes `n+1` times.
- Base case `return 1;` executes once.
- Recursive call `return n * factorial(n - 1);` executes `n` times.\

### Frequency Count for Other Examples

**Example: Combination of Loops and Conditionals**

```java
public class CombinationExample {
    public static void main(String[] args) {
        int n = 10; // n+1
        for (int i = 0; i < n; i++) { // n+1 for initialization, n+1 for condition check, n for increment
            if (i % 2 == 0) { // n
                System.out.println(i + " is even"); // n/2
            } else {
                System.out.println(i + " is odd"); // n/2
            }
        }
    }
}
```

**Explanation**:
- `int n = 10;` executes once (n+1).
- Outer loop initialization, condition check, and increment: `n+1`, `n+1`, `n`.
- `if (i % 2 == 0)` executes `n` times.
- `System.out.println(i + " is even");` and `System.out.println(i + " is odd");` each execute `n/2` times.

Sure! Here are more examples involving loops with exponential and logarithmic complexity, with frequency counts annotated in Java syntax.\

### Example: Exponential Growth (Fibonacci Sequence)

**Recursive Fibonacci Sequence**

```java
public class ExponentialGrowth {
    public static void main(String[] args) {
        int n = 5; // 1
        System.out.println(fibonacci(n)); // 1
    }

    public static int fibonacci(int n) {
        if (n <= 1) { // T(n) = T(n-1) + T(n-2) + 1
            return n; // 1 for each base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // T(n) = T(n-1) + T(n-2) + 1
        }
    }
}
```

**Explanation**:
- `int n = 5;` and `System.out.println(fibonacci(n));` each execute once.
- `if (n <= 1)` executes for every recursive call.
- The recursive calls create an exponential growth in the number of executions, leading to a time complexity of $(O(2^n)$.\


### Example: Logarithmic Complexity (Binary Search)

**Binary Search**

```java
public class LogarithmicSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // 1
        int target = 7; // 1
        int index = binarySearch(array, target); // 1
        if (index != -1) { // 1
            System.out.println("Element found at index: " + index); // 1
        } else {
            System.out.println("Element not found"); // 1
        }
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0; // 1
        int high = array.length - 1; // 1
        while (low <= high) { // log(n)+1
            int mid = (low + high) / 2; // log(n)
            if (array[mid] == target) { // log(n)
                return mid; // log(n) (only if found)
            } else if (array[mid] < target) { // log(n)
                low = mid + 1; // log(n)
            } else {
                high = mid - 1; // log(n)
            }
        }
        return -1; // 1
    }
}
```

**Explanation**:
- Array and target initialization: `1` time each.
- Binary search while loop: `log(n)+1` iterations.
- Mid calculation and comparison: `log(n)` times.
- Adjusting low or high: `log(n)` times.
- Overall, the binary search has a time complexity of $O(\log n)$.\

### Example: Nested Loops with Logarithmic Complexity

**Example: Logarithmic Nested Loop**

```java
public class LogarithmicNestedLoop {
    public static void main(String[] args) {
        int n = 16; // 1
        for (int i = 1; i < n; i *= 2) { // log(n)+1 for initialization, log(n) for condition check, log(n) for update
            for (int j = 1; j < n; j *= 2) { // (log(n)+1)^2 for initialization, log(n)*log(n) for condition check, log(n)*log(n) for update
                System.out.println("i: " + i + ", j: " + j); // log(n) * log(n)
            }
        }
    }
}
```

**Explanation**:
- Outer loop with `i *= 2` runs \( \log(n) \) times.
- Inner loop with `j *= 2` also runs \( \log(n) \) times for each iteration of the outer loop.
- The total number of print statements executed is \( \log(n) \times \log(n) \), leading to a time complexity of $O((\log n)^2)$.\


### Example: Combination of Exponential and Logarithmic

**Example: Exponential Growth with Logarithmic Steps**

```java
public class ExponentialWithLogarithmic {
    public static void main(String[] args) {
        int n = 16; // 1
        for (int i = 0; i < n; i++) { // n+1 for initialization, n+1 for condition check, n for increment
            int j = 1; // n
            while (j < n) { // n * (log(n)+1)
                System.out.println("i: " + i + ", j: " + j); // n * log(n)
                j *= 2; // n * log(n)
            }
        }
    }
}
```

**Explanation**:
- Outer loop initialization, condition check, and increment: `n+1`, `n+1`, `n`.
- Inner loop with `j *= 2` runs \( \log(n) \) times for each iteration of the outer loop.
- Total print statements: `n \times \log(n)`, leading to a time complexity of $O(n \log n)$.

## Passes
**Definition:**

A pass refers to a complete traversal or scan through the data set by an algorithm.
In the context of sorting algorithms, a pass often means going through the entire list once to perform a specific action.

**Usage:**
Passes are commonly discussed in algorithms where the entire data set is processed multiple times in separate, distinct rounds.

#<img width="548" alt="image" src="https://github.com/Roua91/Courses/assets/165356652/126e8df9-e6c2-4b40-bcb1-af4604625d0f">

