# Selection Sort Algorithm in Python and Java

## Overview
Selection Sort is a simple comparison-based sorting algorithm. It works by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning. The algorithm maintains two subarrays in a given array:
1. The subarray which is already sorted.
2. The remaining subarray which is unsorted.

## Steps of Selection Sort
1. Start with the first element as the minimum.
2. Compare this minimum with the second element, if the second element is smaller than the minimum, then update the minimum.
3. Continue this process for all the elements in the array.
4. After finding the minimum element in the unsorted part, swap it with the first element of the unsorted part.
5. Move the boundary of the sorted subarray one element to the right.
6. Repeat until the entire array is sorted.

### Selection Sort in Python
[SelectionSort.py](https://github.com/Roua91/Courses/blob/main/Algorithms/Sorting/SelectionSort/SelectionSort.py)

### Selection Sort in Java
[SelectionSort.java](https://github.com/Roua91/Courses/blob/main/Algorithms/Sorting/SelectionSort/SelectionSort.java)

## Explanation
- Outer Loop: Runs from the start of the array to the second to last element. It tracks the boundary of the sorted and unsorted subarrays.//
- Inner Loop: Finds the minimum element in the unsorted subarray.//
- Swapping: After finding the minimum element, it is swapped with the first element of the unsorted subarray, effectively expanding the sorted subarray by one element

