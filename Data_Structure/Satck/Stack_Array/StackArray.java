import java.util.Scanner;

public class StackArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Stack: ");
        int n = sc.nextInt();
        Stack st = new Stack(n);

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

class Stack {
    private int top;
    private int arr[];
    private int n;

    public Stack(int n) {
        top = -1;
        this.n = n;
        arr = new int[this.n];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == n - 1;
    }

    // Push an element onto the stack
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = val;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popValue = arr[top];
            arr[top] = 0;
            top--;
            return popValue;
        }
    }

    // Get the current size of the stack
    public int count() {
        return top + 1;
    }

    // Peek the top element of the stack
    public int Top() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return arr[top];
    }

    // Access the value at a given position
    public int peek(int pos) {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return arr[pos];
        }
    }

    // Update the value at a given position
    public void updateValue(int pos, int val) {
        if (pos > count()) {
            System.out.println("Stack Overflow");
        } else {
            arr[pos - 1] = val;
            System.out.println("Value Updated at position " + pos);
        }
    }

    // Display all elements in the stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("All values in the Stack are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
