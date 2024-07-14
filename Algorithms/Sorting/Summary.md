### Summary Table


| Sorting Algorithm | Worst Case Complexity | Best Case Complexity | Stability | Use of Recursion | Additional Notes |
|--------------------|-----------------------|----------------------|-----------|------------------|------------------|
| Selection Sort     | $( O(n^2) \)$           | $\( O(n^2) \)$          | Not Stable | Iterative        | Simple and inefficient on large lists. |
| Insertion Sort     | $\( O(n^2) \)$           | $\( O(n) \)$            | Stable    | Iterative        | Efficient for small data sets or nearly sorted data. |
| Quick Sort         | $\( O(n^2) \)$ (worst), $\( O(n \log n) \)$ (avg) | $\( O(n \log n) \)$     | Not Stable | Recursive        | Efficient for large datasets; worst case can be mitigated with good pivot selection. |
| Merge Sort         | $\( O(n \log n) \)$      | $\( O(n \log n) \)$     | Stable    | Recursive        | Uses additional space proportional to input size for merging. |
| Shell Sort         | $\( O(n^2) \)$           | $\( O(n \log n) \)$     | Not Stable | Iterative        | Depends on gap sequence; can perform better than $\( O(n^2) \)$ with the right sequence. |



## Advantage & Disavantage

### Selection Sort
**Advantages:**
- Simple implementation.
- In-place sorting (requires \( O(1) \) extra space).
- Works well for small datasets or when memory is limited.

**Disadvantages:**
- \( O(n^2) \) time complexity in all cases (worst, average, and best).
- Not stable (relative order of equal elements may change).

### Insertion Sort
**Advantages:**
- Efficient for small datasets or nearly sorted data (\( O(n) \) in best case).
- Stable (equal elements retain their original order).

**Disadvantages:**
- \( O(n^2) \) time complexity in worst and average cases.
- Inefficient for large datasets due to its quadratic complexity.

### Quick Sort
**Advantages:**
- \( O(n \log n) \) average time complexity, making it efficient for large datasets.
- In-place sorting (usually requires \( O(\log n) \) extra space for recursion).
- Can be implemented to be stable with careful implementation.

**Disadvantages:**
- \( O(n^2) \) worst-case time complexity (rare but possible with poor pivot selection).
- Not stable in its typical recursive form (may change relative order of equal elements).

### Merge Sort
**Advantages:**
- \( O(n \log n) \) time complexity in all cases.
- Stable (equal elements retain their original order).
- Works well with large datasets due to its divide-and-conquer approach.

**Disadvantages:**
- Requires additional space proportional to the size of the input array (\( O(n) \) space complexity).
- More complex to implement iteratively compared to recursive version.

### Shell Sort
**Advantages:**
- Time complexity depends on the gap sequence used; can be \( O(n \log n) \) with the right sequence.
- In-place sorting with \( O(1) \) extra space.
- Simple implementation compared to other \( O(n \log n) \) sorts.

**Disadvantages:**
- Worst-case time complexity can be \( O(n^2) \) depending on gap sequence.
- Not stable (order of equal elements may change depending on the sequence).

Each sorting algorithm has its own strengths and weaknesses, which make them suitable for different scenarios depending on factors like dataset size, data distribution, stability requirements, and available memory.


### Examples for passes for Clarification:

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
