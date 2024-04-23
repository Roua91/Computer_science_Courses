import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array
        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;

        // Display the menu
        System.out.println("Select an operation:");
        System.out.println("1. Accessing Elements");
        System.out.println("2. Insertion");
        System.out.println("3. Deletion");
        System.out.println("4. Updating");
        System.out.println("5. Traversal");
        System.out.println("6. Searching");
        System.out.println("7. Sorting");
        System.out.println("8. Merging");
        System.out.println("9. Splitting");

        // Read the user's choice
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Accessing Elements
                System.out.println("Enter the index to access:");
                int index = scanner.nextInt();
                if (index >= 0 && index < size) {
                    System.out.println("Element at index " + index + ": " + arr[index]);
                } else {
                    System.out.println("Invalid index!");
                }
                break;

            case 2:
                // Insertion
                System.out.println("Enter the value to insert:");
                int valueToInsert = scanner.nextInt();
                System.out.println("Enter the index to insert at:");
                int insertIndex = scanner.nextInt();
                if (insertIndex >= 0 && insertIndex <= size) {
                    int[] newArr = new int[size + 1];
                    System.arraycopy(arr, 0, newArr, 0, insertIndex);
                    newArr[insertIndex] = valueToInsert;
                    System.arraycopy(arr, insertIndex, newArr, insertIndex + 1, size - insertIndex);
                    arr = newArr;
                    size++;
                    System.out.println("Element inserted successfully!");
                } else {
                    System.out.println("Invalid index!");
                }
                break;

            case 3:
                // Deletion
                System.out.println("Enter the index to delete:");
                int deleteIndex = scanner.nextInt();
                if (deleteIndex >= 0 && deleteIndex < size) {
                    int[] newArr = new int[size - 1];
                    System.arraycopy(arr, 0, newArr, 0, deleteIndex);
                    System.arraycopy(arr, deleteIndex + 1, newArr, deleteIndex, size - deleteIndex - 1);
                    arr = newArr;
                    size--;
                    System.out.println("Element deleted successfully!");
                } else {
                    System.out.println("Invalid index!");
                }
                break;

            case 4:
                // Updating
                System.out.println("Enter the index to update:");
                int updateIndex = scanner.nextInt();
                System.out.println("Enter the new value:");
                int newValue = scanner.nextInt();
                if (updateIndex >= 0 && updateIndex < size) {
                    arr[updateIndex] = newValue;
                    System.out.println("Element updated successfully!");
                } else {
                    System.out.println("Invalid index!");
                }
                break;

            case 5:
                // Traversal
                System.out.println("Array elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                break;

            case 6:
                // Searching
                System.out.println("Enter the element to search:");
                int searchElement = scanner.nextInt();
                boolean found = false;
                for (int i = 0; i < size; i++) {
                    if (arr[i] == searchElement) {
                        found = true;
                        System.out.println("Element found at index " + i);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Element not found in the array!");
                }
                break;

            case 7:
                // Sorting
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Array sorted in ascending order:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                break;

            case 8:
                // Merging
                int[] arr2 = {60, 70, 80, 90, 100};
                int[] mergedArr = new int[size + arr2.length];
                System.arraycopy(arr, 0, mergedArr, 0, size);
                System.arraycopy(arr2, 0, mergedArr, size, arr2.length);
                System.out.println("Arrays merged:");
                for (int i = 0; i < mergedArr.length; i++) {
                    System.out.print(mergedArr[i] + " ");
                }
                System.out.println();
                break;

            case 9:
                // Splitting
                int splitIndex = size / 2;
                int[] firstHalf = new int[splitIndex];
                int[] secondHalf = new int[size - splitIndex];
                System.arraycopy(arr, 0, firstHalf, 0, splitIndex);
                System.arraycopy(arr, splitIndex, secondHalf, 0, size - splitIndex);
                System.out.println("Array split into two halves:");
                System.out.print("First Half: ");
                for (int i = 0; i < firstHalf.length; i++) {
                    System.out.print(firstHalf[i] + " ");
                }
                System.out.println();
                System.out.print("Second Half: ");
                for (int i = 0; i < secondHalf.length; i++) {
                    System.out.print(secondHalf[i] + " ");
                }
                System.out.println();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

import java.util.Scanner;

class ArrayOperations{
    public statics void main(String args){
        Scanner sc = new Scanner(System.in);

        System.out.println() //keep going
    }

    public void getElem(int index){
        if(index <= 0 || index < arr.size){
            System.out.println("The elemnt in index "+ index + " is "+ arr[index]);
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public void InsertElment(int index, int element){
        if(index >= 0 && index <= size){}
    }
}


if (insertIndex >= 0 && insertIndex <= size) {
                    int[] newArr = new int[size + 1];
                    System.arraycopy(arr, 0, newArr, 0, insertIndex);
                    newArr[insertIndex] = valueToInsert;
                    System.arraycopy(arr, insertIndex, newArr, insertIndex + 1, size - insertIndex);
                    arr = newArr;
                    size++;
                    System.out.println("Element inserted successfully!");
