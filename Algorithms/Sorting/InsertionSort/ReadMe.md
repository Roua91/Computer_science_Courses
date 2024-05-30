# Insertion Sort
### Definition:
Insertion Sort is a simple and intuitive sorting algorithm that builds the final sorted array one element at a time. It is much like sorting playing cards in your hands; you pick one card at a time and insert it into its correct position among the already sorted cards.


### Process:
- Start with the second element, considering the first element as sorted.
- Compare the current element with the elements in the sorted portion.
- Shift all elements in the sorted portion that are greater than the current element to the right.
- Insert the current element into its correct position.
- Repeat the process for all elements until the entire array is sorted.


### Stability Definition and Stability:
A sorting algorithm is stable if it maintains the relative order of equal elements in the sorted output as they were in the input.

**Stability**: Insertion Sort is stable because it only swaps elements when necessary, thus preserving the relative order of equal elements.


### Time Complexity:
- Best Case: O(n) - The array is already sorted.
- Average Case: O(n^2) - The elements are in random order.
- Worst Case: O(n^2) - The array is sorted in reverse order.

## Java Implementation 
[InsertionSort.java](https://github.com/Roua91/Courses/blob/main/Algorithms/Sorting/InsertionSort/InsertionSort.java)
