import java.util.Arrays;

public class Quick_Sort {
    // Method to perform Quick Sort on the array
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivot = arr[highIndex]; // Choose the pivot element from the end of the array

            int leftPointer = lowIndex; // Pointer starting from the beginning of the array
            int rightPointer = highIndex; // Pointer starting from the end of the array

            // Partitioning process
            while (leftPointer < rightPointer) {
                // Move the left pointer to the right as long as elements are less than or equal to the pivot
                while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                    leftPointer++;
                }
                // Move the right pointer to the left as long as elements are greater than or equal to the pivot
                while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                    rightPointer--;
                }
                // Swap elements at the left and right pointers
                swap(arr, leftPointer, rightPointer);
            }
            // Swap the pivot element with the element at the left pointer
            swap(arr, leftPointer, highIndex);

            // Recursively sort elements before and after partition
            quickSort(arr, lowIndex, leftPointer - 1);
            quickSort(arr, leftPointer + 1, highIndex);
        }
    }

    // Method to swap two elements in the array
    private static void swap(int arr[], int i, int j) {
        int temp = arr[i]; // Store the value at index i in a temporary variable
        arr[i] = arr[j]; // Assign the value at index j to index i
        arr[j] = temp; // Assign the value in the temporary variable to index j
    }

    // Main method to test the Quick Sort implementation
    public static void main(String[] args) {
        int arr[] = { 4, 21, 1, 9, -12, 5, 32, 2, 6 }; // Initialize an array to be sorted
        System.out.println("Array before Sorting: " + Arrays.toString(arr)); // Print the array before sorting

        int n = arr.length; // Get the length of the array
        quickSort(arr, 0, n - 1); // Call quickSort method to sort the array
        System.out.println("Array after Sorting: " + Arrays.toString(arr)); // Print the array after sorting
    }
}
