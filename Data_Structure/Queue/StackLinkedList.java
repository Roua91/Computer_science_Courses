import java.util.Scanner;

public class StackLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

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
                    stack.push(val);
                    break;

                case 2:
                    System.out.println("Popped: " + stack.pop());
                    break;

                case 3:
                    System.out.println("Current size of stack: " + stack.count());
                    break;

                case 4:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    stack.updateValue(pos, val);
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.println("Value at position " + pos + ": " + stack.peekAtPosition(pos));
                    break;

                case 6:
                    stack.display();
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

    public Stack() {
        this.top = null;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Pushed " + data);
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }

    // Peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.println("Stack elements are:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    // Get the current size of the stack
    public int count() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Update the value at a given position
    public void updateValue(int pos, int val) {
        if (pos > count() || pos <= 0) {
            System.out.println("Invalid position");
        } else {
            Node temp = top;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            temp.data = val;
            System.out.println("Value updated at position " + pos);
        }
    }

    // Access the value at a given position
    public int peekAtPosition(int pos) {
        if (pos > count() || pos <= 0) {
            System.out.println("Invalid position");
            return -1;
        } else {
            Node temp = top;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }
}
