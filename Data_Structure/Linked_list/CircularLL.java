import java.util.Scanner;

public class CircularListDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linklist list = new Linklist();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the Start");
            System.out.println("2. Insert at the End");
            System.out.println("3. Display List");
            System.out.println("4. Get List Size");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the start: ");
                    int value1 = scanner.nextInt();
                    list.insertAtFirst(value1);
                    break;
                case 2:
                    System.out.print("Enter value to insert at the end: ");
                    int value2 = scanner.nextInt();
                    list.insertAtLast(value2);
                    break;
                case 3:
                    System.out.println("Current List: ");
                    list.displayList();
                    break;
                case 4:
                    System.out.println("List Size: " + list.getSize());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}

class Linklist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node last;
    private int size;

    public Linklist() {
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtFirst(int val) {
        Node n = new Node(val);
        if (isEmpty()) {
            last = n;
            last.next = last;
        } else {
            n.next = last.next;
            last.next = n;
        }
        size++;
    }

    public void insertAtLast(int val) {
        Node n = new Node(val);
        if (isEmpty()) {
            last = n;
            last.next = last;
        } else {
            n.next = last.next;
            last.next = n;
            last = n;
        }
        size++;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("(back to start)");
    }
}
