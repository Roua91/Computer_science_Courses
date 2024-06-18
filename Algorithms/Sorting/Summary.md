### Summary Table

| Sorting Algorithm | Worst Case Complexity | Stability | Use of Recursion | Passes Calculation |
|-------------------|------------------------|-----------|------------------|--------------------|
| **Selection Sort**| $(O(n^2)\)$             | Not Stable| Iterative        | $(n-1\)$            |
| **Insertion Sort**| $(O(n^2)\)$             | Stable    | Iterative        | $(n-1\)$            |
| **Quick Sort**    | $(O(n^2)\)$             | Not Stable| Recursive        | $(\log_2(n)\)$ (average), \(n\) (worst case) |
| **Merge Sort**    | $(O(n \log n)\)$        | Stable    | Recursive        | $(\log_2(n)\)$      |
| **Shell Sort**    | $(O(n^2)\)$             | Not Stable| Iterative        | Depends on gap sequence |

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
