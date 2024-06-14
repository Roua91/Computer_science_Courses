import java.util.Scanner;

public class QueueArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Queue: ");
        int n = sc.nextInt();
        Queue queue = new Queue(n);

        boolean flag = true;
        int val;
        int pos;
        while (flag) {
            System.out.println("1. Enqueue item in Queue");
            System.out.println("2. Dequeue item from Queue");
            System.out.println("3. Current size of Queue");
            System.out.println("4. Update value at position");
            System.out.println("5. View value at position");
            System.out.println("6. View Queue");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    queue.enqueue(val);
                    break;
                case 2:
                    System.out.println(queue.dequeue());
                    break;
                case 3:
                    System.out.println(queue.size());
                    break;
                case 4:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    queue.updateValue(pos, val);
                    break;
                case 5:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.println(queue.position(pos));
                    break;
                case 6:
                    queue.display();
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

class Queue{
    private int front;
    private int rear;
    private int[] arr;
    private int n;

    public Queue(int n){
        front = -1;
        rear = -1;
        this.n= n;
        arr = new int[this.n];
    }

    public boolean isEmpty(){
        return front == -1 || front > rear;
    }

    public boolean isFull(){
        return rear == n -1;
    }
    // Enqueue an element into the queue
    public void enqueue(int val){
        if(isFull()){
            System.out.println("Overflow");
        }
        else{
            if(isEmpty()){
                front = 0;
            }
            arr[++rear]= val;
        }
    }

    // Dequeue an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return 0;
        } else {
            int dequeueValue = arr[front++];
            return dequeueValue;
        }
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return rear - front +1;
    }

    // Access the value at a given position
    public int position(int pos){
        if(isEmpty() || pos > size()){
            System.out.println("Invalid position");
            return 0;
        }
        else{
            return arr[front + pos - 1];
        }
    }

    public void updateValue(int pos, int val){
        if(isEmpty() || pos > size()){
            System.out.println("Invalid Position");
        }
        else{
            arr[front + pos -1] = val;
            System.out.println("Value updated at postion " + pos);
        }
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("All values in the Queue are: ");
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
