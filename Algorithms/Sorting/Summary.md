### Summary Table


| Sorting Algorithm | Worst Case Complexity | Best Case Complexity | Stability | Use of Recursion | Additional Notes |
|--------------------|-----------------------|----------------------|-----------|------------------|------------------|
| Selection Sort     | $\( O(n^2) \)$           | \( O(n^2) \)          | Not Stable | Iterative        | Simple and inefficient on large lists. |
| Insertion Sort     | \( O(n^2) \)           | \( O(n) \)            | Stable    | Iterative        | Efficient for small data sets or nearly sorted data. |
| Quick Sort         | \( O(n^2) \) (worst), \( O(n \log n) \) (avg) | \( O(n \log n) \)     | Not Stable | Recursive        | Efficient for large datasets; worst case can be mitigated with good pivot selection. |
| Merge Sort         | \( O(n \log n) \)      | \( O(n \log n) \)     | Stable    | Recursive        | Uses additional space proportional to input size for merging. |
| Shell Sort         | \( O(n^2) \)           | \( O(n \log n) \)     | Not Stable | Iterative        | Depends on gap sequence; can perform better than \( O(n^2) \) with the right sequence. |



### Details

#### Selection Sort
- **Worst Case Complexity**: $(O(n^2)\)$
- **Stability**: Not Stable
- **Use of Recursion**: Iterative
- **Passes Calculation**: $(n-1\)$

#### Insertion Sort
- **Worst Case Complexity**: $(O(n^2)\)$
- **Stability**: Stable
- **Use of Recursion**: Iterative
- **Passes Calculation**: $(n-1\)$

#### Quick Sort
- **Worst Case Complexity**: $(O(n^2)\)$
- **Stability**: Not Stable
- **Use of Recursion**: Recursive
- **Passes Calculation**: $(\log_2(n)\)$ (average), $(n\)$ (worst case)

#### Merge Sort
- **Worst Case Complexity**: $(O(n \log n)\)$
- **Stability**: Stable
- **Use of Recursion**: Recursive
- **Passes Calculation**: $(\log_2(n)\)$

#### Shell Sort
- **Worst Case Complexity**: $(O(n^2)\)$
- **Stability**: Not Stable
- **Use of Recursion**: Iterative
- **Passes Calculation**: Depends on gap sequence


### Examples for Clarification:

- **Selection Sort Example**:
  - Array: \[7, 6, 4, 3, 1\]
  - Passes: 4 (as \( n-1 = 5-1 \))

- **Insertion Sort Example**:
  - Array: \[7, 6, 4, 3, 1\]
  - Passes: 4 (as \( n-1 = 5-1 \))

- **Merge Sort Example**:
  - Array: \[7, 6, 4, 3, 1\]
  - Passes: \( \log_2(5) \approx 2.32 \), rounded up to 3 levels

- **Quick Sort Example**:
  - Array: \[7, 6, 4, 3, 1\]
  - Average Passes: \( \log_2(5) \approx 2.32 \), rounded up to 3 levels
  - Worst Case Passes: 5 (if always choosing the worst pivot)

- **Shell Sort Example**:
  - Array: \[7, 6, 4, 3, 1\]
  - Passes: Depends on the chosen gap sequence, e.g., for gaps (5/2, 5/4, 1) = (2, 1), there would be 2 passes
