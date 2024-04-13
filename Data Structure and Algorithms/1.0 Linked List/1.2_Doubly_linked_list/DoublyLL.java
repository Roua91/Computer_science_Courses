import java.util.Scanner;

public class DoublyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedLists list = new LinkedLists(); // Instantiate your LinkedLists class

        // Menu to manage the doubly linked list
        while (true) {
            System.out.println("\nDoubly Linked List Operations Menu:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert at Position");
            System.out.println("4. View List");
            System.out.println("5. Reverse View List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

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
                    System.out.println("Reverse List:");
                    list.reverseList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close(); // Close the scanner
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}


class LinkedLists {
    // Node class for doubly linked list
    class Node {
        int data; // Store the integer data
        Node next, prev; // Pointers to the next and previous nodes in the list
    }
    private Node start, tail; // Start points to the first node, tail to the last node of the list
    private int size; // Tracks the number of elements in the list

    // Constructor initializes an empty list
    public LinkedLists() {
        start = null;
        size = 0;
        tail = null;
    }

    // Returns true if the list is empty
    public boolean isEmpty() {
        return start == null;
    }

    // Inserts a node at the beginning of the list
    public void insertAtFirst(int val) {
        Node n = new Node(); // Create a new node
        n.data = val; // Set the data of the node
        if (isEmpty()) {
            tail = n; // If the list was empty, the new node is also the tail
        } else {
            start.prev = n; // Otherwise, set the previous head's previous pointer to the new node
        }
        n.next = start; // The new node's next pointer points to the previous head
        start = n; // Update the start to point to the new node
        size++; // Increment the size of the list
    }

    // Inserts a node at the end of the list
    public void insertAtLast(int val) {
        Node n = new Node(); // Create a new node
        n.data = val; // Set the data of the node
        if (isEmpty()) {
            start = n; // If the list was empty, the new node is also the start
        } else {
            tail.next = n; // Link the current tail's next to new node
            n.prev = tail; // Set the new node's prev to the old tail
        }
        tail = n; // Update tail to the new node
        size++; // Increment the size of the list
    }

    // Reverses the list and prints its content from tail to start
    public void reverseList() {
        if (isEmpty()) {
            System.out.println("Empty List"); // Check if the list is empty
            return;
        }
        Node t = tail;
        while (t != null) {
            System.out.print(t.data + "___-->"); // Print data from the tail to start
            t = t.prev; // Move to the previous node
        }
        System.out.println("null");
    }

    // Prints all the elements in the list from start to end
    public void viewList() {
        if (isEmpty()) {
            System.out.println("Empty list"); // Check if the list is empty
            return;
        }
        Node t = start;
        while (t != null) {
            System.out.print(t.data + "|___|--> "); // Print each node's data
            t = t.next; // Move to the next node
        }
        System.out.println("null");
    }

  public void insertAtPos(int val, int pos) {
    // Check for a valid position
    if (pos < 1 || pos > size + 1) {
        System.out.println("Invalid position");
        return;
    }

    // If position is 1, use existing method to insert at the start
    if (pos == 1) {
        insertAtFirst(val);
        return;
    }

    // If position is size + 1, use existing method to insert at the end
    if (pos == size + 1) {
        insertAtLast(val);
        return;
    }

    // Create a new node
    Node n = new Node();
    n.data = val;

    // Traverse to the position where the new node is to be inserted
    Node current = start;
    for (int i = 1; i < pos - 1; i++) {
        current = current.next;
    }

    // Link the new node with its next and previous nodes
    n.next = current.next;
    n.prev = current;
    current.next.prev = n;
    current.next = n;

    // Increment size
    size++;
    System.out.println("Inserted " + val + " at position " + pos);
}

}

