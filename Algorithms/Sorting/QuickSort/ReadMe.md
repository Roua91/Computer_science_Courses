# Quick Sort
_1- Choosing a Pivot:_ Quick Sort starts by selecting a 'pivot' element from the array. The choice of the pivot can vary, but common strategies include picking the last element, the first element, or a random element.

2- Partitioning: The main task in Quick Sort is to partition the array into two halves:
- Elements less than or equal to the pivot are moved to the left of the pivot.
- Elements greater than the pivot are moved to the right of the pivot.
- This ensures that the pivot is in its correct sorted position.
  
3- Recursive Sorting: After partitioning, the algorithm recursively applies the same process to the sub-arrays formed by splitting at the pivot. This means Quick Sort sorts the left part and the right part separately and recursively.

4- Base Case: The recursion stops when the sub-array has one or zero elements, which are inherently sorted.

### Key Characteristics
- Time Complexity: On average, Quick Sort operates in O(n log n) time, making it very efficient for large datasets. However, in the worst case (e.g., when the smallest or largest element is always chosen as the pivot), it can degrade to O(n²).
- In-Place: Quick Sort is an in-place sorting algorithm, meaning it requires only a small, constant amount of extra storage space.
- Not Stable: Quick Sort is not a stable sort, meaning that it does not preserve the relative order of equal elements.
