import java.util.Scanner;

public class SinglyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedLists list = new LinkedLists(); // Instantiate your LinkedLists class

        // Menu to manage the singly linked list
        while (true) {
            System.out.println("\nSingly Linked List Operations Menu:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert at Position");
            System.out.println("4. View List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt(); // Read user's choice

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at first: ");
                    int value1 = sc.nextInt();
                    list.insertAtFirst(value1);
                    break;
                case 2:
                    System.out.print("Enter value to insert at last: ");
                    int value2 = sc.nextInt();
                    list.insertAtLast(value2);
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    int value3 = sc.nextInt();
                    System.out.print("Enter position to insert: ");
                    int position = sc.nextInt();
                    list.insertAtPos(value3, position);
                    break;
                case 4:
                    System.out.println("Current List:");
                    list.viewList();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close(); // Close the scanner
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}

class LinkedLists {
    // Node class for singly linked list
    class Node {
        int data; // Store the integer data
        Node next; // Pointer to the next node in the list
    }
    private Node head; // Head points to the first node of the list
    private int size; // Tracks the number of elements in the list

    // Constructor initializes an empty list
    public LinkedLists() {
        head = null;
        size = 0;
    }

    // Returns true if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Inserts a node at the beginning of the list
    public void insertAtFirst(int val) {
        Node n = new Node(); // Create a new node
        n.data = val; // Set the data of the node
        n.next = head; // New node's next pointer points to the current head
        head = n; // Update the head to the new node
        size++; // Increment the size of the list
    }

    // Inserts a node at the end of the list
    public void insertAtLast(int val) {
        Node n = new Node(); // Create a new node
        n.data = val; // Set the data of the node
        if (isEmpty()) {
            head = n; // If the list was empty, set head to the new node
        } else {
            Node t = head;
            while (t.next != null) { // Traverse to the end of the list
                t = t.next;
            }
            t.next = n; // Link the last node's next to new node
        }
        size++; // Increment the size of the list
    }

    // Prints all the elements in the list from head to end
    public void viewList() {
        if (isEmpty()) {
            System.out.println("Empty list"); // Check if the list is empty
            return;
        }
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> "); // Print each node's data
            t = t.next; // Move to the next node
        }
        System.out.println("null");
    }

    public void insertAtPos(int val, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            insertAtFirst(val);
            return;
        }
        Node n = new Node();
        n.data = val;
        Node current = head;
        for (int i = 1; i < pos - 1; i++) { // Traverse to the position before where new node will be inserted
            current = current.next;
        }
        n.next = current.next; // Set new node
    }
