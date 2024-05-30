# Selection Sort Algorithm

### Definition:
Selection Sort is a straightforward sorting algorithm that repeatedly selects the smallest (or largest, depending on the order) element from the unsorted portion of the list and swaps it with the first unsorted element.


### Process:
Find the smallest element in the unsorted portion of the array.
Swap it with the first element of the unsorted portion.
Move the boundary between the sorted and unsorted portions one element to the right.
Repeat the process until the entire array is sorted.


### Stability Definition and Stability:
Stability: Selection Sort is not stable because it can change the relative order of equal elements by swapping non-adjacent elements.


### Time Complexity:
- Best Case: O(n^2) - Regardless of the input, Selection Sort always performs the same number of comparisons.
- Average Case: O(n^2)
- Worst Case: O(n^2)


### Illustration
  ![image](https://github.com/Roua91/Courses/assets/165356652/f36a77cd-0575-43a8-9a16-e30050811d89)


## Selection Sort in Python
[SelectionSort.py](https://github.com/Roua91/Courses/blob/main/Algorithms/Sorting/SelectionSort/SelectionSort.py)

## Selection Sort in Java
[SelectionSort.java](https://github.com/Roua91/Courses/blob/main/Algorithms/Sorting/SelectionSort/SelectionSort.java)


