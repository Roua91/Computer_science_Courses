import java.util.Scanner;

public class ArrayOperations {
    private static int[] arr = {10, 20, 30, 40, 50};
    private static int size = arr.length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Select an operation:");
        System.out.println("1. Accessing Elements");
        System.out.println("2. Insertion");
        System.out.println("3. Deletion");
        System.out.println("4. Updating");
        System.out.println("5. Searching");
        System.out.println("6. Sorting");
        System.out.println("7. Merging");
        System.out.println("8. Splitting");

        // Read the user's choice
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Accessing Elements
                System.out.println("Enter the index to access:");
                int index = scanner.nextInt();
                getElem(index);
                break;

            case 2:
                // Insertion
                System.out.println("Enter the index to insert at:");
                int insertIndex = scanner.nextInt();
                System.out.println("Enter the element to insert:");
                int element = scanner.nextInt();
                insertElement(insertIndex, element);
                break;

            case 3:
                // Deletion
                System.out.println("Enter the index to delete:");
                int deleteIndex = scanner.nextInt();
                deleteElement(deleteIndex);
                break;

            case 4:
                // Updating
                System.out.println("Enter the index to update:");
                int updateIndex = scanner.nextInt();
                System.out.println("Enter the new value:");
                int newValue = scanner.nextInt();
                updateElement(updateIndex, newValue);
                break;

            case 5:
                // Searching
                System.out.println("Enter the element to search:");
                int searchElement = scanner.nextInt();
                searchElement(searchElement);
                break;

            case 6:
                // Sorting
                sorting(arr);
                System.out.println("Array sorted in ascending order:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                break;

            case 7:
                // Merging
                int[] arr2 = {60, 70, 80, 90, 100};
                merge(arr2);
                break;

            case 8:
                // Splitting
                split();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static void getElem(int index) {
        if (index >= 0 && index < size) {
            System.out.println("The element at index " + index + " is " + arr[index]);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void insertElement(int index, int element) {
        if (index >= 0 && index <= size) {
            int[] newArr = new int[size + 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            newArr[index] = element;
            System.arraycopy(arr, index, newArr, index + 1, size - index);
            arr = newArr;
            size++;
            System.out.println("Element inserted successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void deleteElement(int index) {
        if (index >= 0 && index < size) {
            int[] newArr = new int[size - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, size - index - 1);
            arr = newArr;
            size--;
            System.out.println("Element deleted successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void updateElement(int index, int val) {
        if (index >= 0 && index < size) {
            arr[index] = val;
            System.out.println("Element updated successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void searchElement(int val) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void merge(int[] arr2) {
        int[] mergedArr = new int[size + arr2.length];
        System.arraycopy(arr, 0, mergedArr, 0, size);
        System.arraycopy(arr2, 0, mergedArr, size, arr2.length);
        System.out.println("Arrays merged:");
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
        System.out.println();
    }

    public static void split() {
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
    }
}


             

