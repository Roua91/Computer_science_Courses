import java.util.Arrays;

public class InsertionSort{
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j= i-1;

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;

        }
    }
    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr){
            System.out.println(num + " ");}
    }
}

