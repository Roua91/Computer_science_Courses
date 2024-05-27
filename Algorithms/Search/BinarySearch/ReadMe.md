# Binary Search 

## overveiw

Binary Search is an efficient algorithm for finding an element in a sorted array. It works by repeatedly dividing the search interval in half and comparing the target value to the middle element of the interval. Here's a quick overview of how it works and a Java implementation.

## How Binary Search Works

1. **Initialization**: Start with two pointers, `low` and `high`, pointing to the beginning and end of the array, respectively.
2. **Calculate Midpoint**: Compute the middle index `mid` of the current search interval.
3. **Comparison**:
   - If the target value is equal to the middle element, the search is complete.
   - If the target value is less than the middle element, narrow the search to the left half of the array by adjusting `high`.
   - If the target value is greater than the middle element, narrow the search to the right half of the array by adjusting `low`.
4. **Repeat**: Repeat the process until the target is found or the search interval is empty (i.e., `low` exceeds `high`).

## Key Characteristics

- **Time Complexity**: O(log n), where n is the number of elements in the array. This makes Binary Search very efficient for large datasets.
- **Space Complexity**: O(1), since it only requires a few extra variables for tracking the search interval.
- **Precondition**: The array must be sorted prior to performing Binary Search.

## java implementation 
[BinarySearch.java](https://github.com/Roua91/Courses/tree/main/Algorithms/Search/BinarySearch)
