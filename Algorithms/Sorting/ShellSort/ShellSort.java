public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        
        // Start with a big gap, then reduce the gap
        while (gap > 0) {
            for (int i = gap; i < n; i++) { itterate the array
                int temp = arr[i];
                int j = i;
                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                while (j >= gap && arr[j - gap] > temp) { 
                    arr[j] = arr[j - gap];  
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap /= 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        shellSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
