import java.util.Scanner;

public class StackLinkedList {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();

        boolean flag = true;
        int val;
        int pos = 0;
        while (flag) {

            System.out.println("1. Push item in Stack");
            System.out.println("2. Pop item out from Stack");
            System.out.println("3. Current size of stack");
            System.out.println("4. Update value at position");
            System.out.println("5. View value at position");
            System.out.println("6. View Stack");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {

            case 1:
                System.out.print("Enter value: ");
                val = sc.nextInt();
                st.push(val);
                break;

            case 2:
                System.out.println(st.pop());
                break;

            case 3:
                System.out.println(st.count());
                break;

            case 4:
                System.out.print("Enter value: ");
                val = sc.nextInt();
                System.out.print("Enter position: ");
                pos = sc.nextInt();
                st.updateValue(pos, val);
                break;

            case 5:
                System.out.print("Enter position: ");
                pos = sc.nextInt();
                System.out.println(st.peek(pos));
                break;

            case 6:
                st.display();
                break;

            case 7:
                flag = false;
                break;

            default:
                System.out.println("Invalid Choice");
            }
            System.out.println();
        }

        sc.close();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(int val) {
        Node newNode = new Node(val);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popValue = top.data;
            top = top.next;
            size--;
            return popValue;
        }
    }

    // Get the current size of the stack
    public int count() {
        return size;
    }

    // Access the value at a given position
    public int peek(int pos) {
        if (isEmpty() || pos > size) {
            System.out.println("Invalid Position");
            return 0;
        } else {
            Node current = top;
            for (int i = 1; i < pos; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

    // Update the value at a given position
    public void updateValue(int pos, int val) {
        if (pos > size) {
            System.out.println("Invalid Position");
        } else {
            Node current = top;
            for (int i = 1; i < pos; i++) {
                current = current.next;
            }
            current.data = val;
            System.out.println("Value Updated at position " + pos);
        }
    }

    // Display all elements in the stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("All values in the Stack are: ");
            Node current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
