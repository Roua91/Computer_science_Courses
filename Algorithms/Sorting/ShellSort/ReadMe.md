# Shell Sort
### Definition:
Shell Sort is an in-place comparison sort that generalizes Insertion Sort to allow the exchange of items that are far apart. The idea is to arrange the data sequence into a number of interleaved subsequences, and then sort each subsequence individually using a modified insertion sort.


### Process:
- Choose an initial gap sequence (e.g., N/2, N/4, ..., 1).
- For each gap, perform a gapped insertion sort.
- Continue reducing the gap until it becomes 1, at which point a final pass of regular insertion sort is performed.


### Stability Definition and Stability:
Stability: Shell Sort is not stable because it allows far-apart elements to be swapped, which can change the relative order of equal elements.


### Time Complexity:
- Best Case: O(n log n) - Depends on the gap sequence.
- Average Case: O(n^1.5) - Depends on the gap sequence.
- Worst Case: O(n^2) - Depends on the gap sequence.

## Java Impelemntation 
[ShellSort.java](https://github.com/Roua91/Courses/blob/main/Algorithms/Sorting/ShellSort/ShellSort.java)
