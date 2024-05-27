public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = low + (high -low) / 2; // Calculate the middle index

            // Check if the target is present at the mid position
            if (arr[mid] == target) {
                return mid; // Target found, return its index
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid +1;
            }
            // If the target is smaller, ignore the right half
            else {
                high = mid -1;
            }
        }

        // Target not found in the array
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = { -12, 1, 2, 4, 5, 6, 9, 21, 32 }; // Sorted array to search in
        int target = 9; // Target element to search for

        int result = binarySearch(arr, target); // Call binarySearch method

        if (result == -1) {
            System.out.println("Element not present in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
