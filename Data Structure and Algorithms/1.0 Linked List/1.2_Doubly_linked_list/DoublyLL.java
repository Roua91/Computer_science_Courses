import java.util.Scanner;

public class DoublyLL{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Linkedlists list = new Linkedlists();
  }
}

class Linkedlists{
  class Node{
    int data; //store the integer data
    Node next, prev; //pointers to the next and node
  }
  private Node start, tail;
  private int size; //number of elemets in the list

  public Linkedlists(){
    start = null;
    size = 0;
    tail = null;
  }

  public void insertAtFirst(int val){  //complete //complete
    Node n = new Node();
    n.data = val;
    if(isEmpty()){
      tail = n;
    }
    else{
      start.prev = n;
    }
    n.next = start;
    start = n;
    size++;
  }

  public void insertAtLast(){
    
  }

  //reverso the list and print it's content from tail to start
  public void reverseList(){
    if(isEmpty()){
      System.out.println("Empty List");
      return;
    }
    Node t = tail;
    while (t != null){
      System.out.print(t.data + "__" + "-->");
      t = t.getPrev();
    }
    System.out.print("null");
  }

  // Check if the list is empty
    public boolean isEmpty() {
        return start == null;
    }
}
