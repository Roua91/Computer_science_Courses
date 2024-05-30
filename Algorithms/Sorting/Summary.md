# Summary 
### Selection Sort

- **Complexity**:
  - Best Case: $O(n^2)$
  - Average Case: $O(n^2)$
  - Worst Case: $O(n^2)$

- **Stability**: 
  - Not stable. The relative order of equal elements may change because of the swapping mechanism.

- **Use of Recursion**: 
  - Does not use recursion. It is an iterative algorithm.

### Insertion Sort

- **Complexity**:
  - Best Case: $O(n)$
  - Average Case: $O(n^2)$
  - Worst Case: $O(n^2)$

- **Stability**:
  - Stable. Equal elements retain their relative order.

- **Use of Recursion**:
  - Does not use recursion. It is typically implemented iteratively.

### Quick Sort

- **Complexity**:
  - Best Case: $O(n \log n)$
  - Average Case: $O(n \log n)$
  - Worst Case: $O(n^2)$ (when the pivot elements are poorly chosen)

- **Stability**:
  - Not stable. The relative order of equal elements may change because of the partitioning process.

- **Use of Recursion**:
  - Uses recursion. It is a recursive algorithm with the divide-and-conquer approach.

### Merge Sort

- **Complexity**:
  - Best Case: $O(n \log n)$
  - Average Case: $O(n \log n)$
  - Worst Case: $O(n \log n)$

- **Stability**:
  - Stable. Equal elements retain their relative order during the merging process.

- **Use of Recursion**:
  - Uses recursion. It is a recursive algorithm that repeatedly divides the array and merges sorted sub-arrays.

### Shell Sort

- **Complexity**:
  - Best Case: $O(n log n)$ (depends on the gap sequence)
  - Average Case: $O(n^{1.5})$ (depends on the gap sequence)
  - Worst Case: $O(n^2)$ (depends on the gap sequence)

- **Stability**:
  - Not stable. The relative order of equal elements may change because of the gapped insertion process.

- **Use of Recursion**:
  - Does not typically use recursion. It is an iterative algorithm that uses a sequence of increments (gaps).
