# Quick Sort
### Definition:
Quick Sort is a highly efficient and widely used sorting algorithm. It employs a divide-and-conquer strategy by selecting a 'pivot' element and partitioning the array into two sub-arrays, elements less than the pivot and elements greater than the pivot, then recursively sorting the sub-arrays.\\

### Process:
- Choose a pivot element from the array.
- Partition the array into two sub-arrays: elements less than the pivot and elements greater than the pivot.
- Recursively apply the same process to the sub-arrays.
- Combine the sub-arrays to form the final sorted array.\\


### Stability Definition and Stability:
Stability: Quick Sort is not stable because the swapping of elements can change the relative order of equal elements.\\

### Time Complexity:
- Best Case: O(n log n) - The pivot divides the array into two equal halves.
- Average Case: O(n log n)
- Worst Case: O(n^2) - The pivot is the smallest or largest element, leading to highly unbalanced partitions.

### Illustration
  ![image](https://github.com/Roua91/Courses/assets/165356652/b3543e1a-9148-4e1f-9347-46529f4fb0b7)


## Java Implementation 
[QuickSort.java](https://github.com/Roua91/Courses/blob/main/Algorithms/Sorting/QuickSort/QuickSort.java)
