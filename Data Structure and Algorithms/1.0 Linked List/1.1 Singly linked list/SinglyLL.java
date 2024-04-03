package linklist;
import java.util.*;

public class SinglyLL{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Linkedlist list= new Linkedlist();

    boolean falg = true;
    int valu; int posi=0;

    while(flag){
      System.out.println();
      System.out.println("1. Add item to the list at start");
      System.out.println("2.Add item to the list at last");
      System.out.println("3. Add item to the list at posit");
      System.out.println("4. Delete first node");
      System.out.println("5. Delete last node");
      System.out.println("6. Delete node at position");
      System.out.println("7. Update node at position");
      System.out.println("8. Reverse link list");
      System.out.println("9. View list");
      System.out.println("10. Get List size");
      System.out.println("Exit");
      System.out.println();
      System.out.println("Enter a choice");
      int choice = sc.nextInt();

      switch(choice){
        case 1: System.out.println("Enter a value");
          valu= sc.nextInt();
          list.insertAtFirst(valu);
        break; 
        }
    }
  }
}

class Linkedlist{
  class Node{
    private int data; private Node next;
    public Node(){
      data=0;
      next= null;
    }
    public void setData(int d){data=d;}
    public void setNext(Node n){next=n;}
    public int getData(){return data;}
    public Node getNext(){return next;}
  }

  private Node start;
  private int size;

  public Linkedlist(){
    start =null;
    size = 0;
  }

  public void reverseList(){
    Node curr= start;
    Node previous=null;
    Node nex= null;
    while(curr!=null){
      nex=curr.getNext();
      curr.setNext(previous);
      previous=curr;
      curr=nex;
    }
    start=previous;
  }

  public boolean isEmpty(){
    if(start==null)
      return true;
    else
      return false;
  }
  public int getListSize(){
    return size;
  }
  public void viewList(){
    if(isEmpty()){
      System.out.println("Empty List");
      return;
    }
    Node t=start;
    while(t!=null){
      System.out.print(t.getData()+ "|___|"+"-->");
      t=t.getNext();
    }
    System.out.print("null");
  }
  public void insertATFirst(int val){
    Node n = new Node();
    n.setData(val);
    if(!isEmpty()){
      n.setNext(start);
    }
    start=n;
    size++;
  }
  public void insertAtLast(int val){
    Node t =start;
    Node n= new Node();
    n.setData(val);
    if(t==null) start= n;
    else{
      while(t.getNext()!=null){
        t=t.getNext();
      }
      t.setNext();
    }
    size++;
  }
  public void insertAtPos(int val, int pos){
    if(isEmpty()|| pos>size || pos<1){
      System.out.println("Insertion is not possible");
      return;
    }
    else if(pos==1){
      insertAtFirst(val);
    }
    else if(pos == size){
      insertAtLast(val);
    }
    else{
      Node t = start;
      Node n = new Node();
      n.setData(val);
      for(int i = 1; i<pos-1;i++){
        t= t.getNext(); 
      }
      n.setNext(t.getNext());
      t.setNext(n);
      size++;
    }
  }
  public void updateData(int val, int pos){
    if(isEmpty()|| pos>size|| pos<1){
      System.out.println("Updation is not possible");
      return;
    }
    Node t =start;
    for(int i=1; i<pos; i++){
      t=t.getNext();
    }
    t.setData(val);
  }
  public void deleteFirst(){
    if(start==null){
      System.out.println("List is empty");
      return;
    }
    else{
      Node t = start;
      start= start.getNext();
      t.setNext(null);
      size--;
    }
  }
  public void deleteLast(){
    if(start==null){
      System.out.println("list is empty");
      return;
    }
    else{
      Node t = start;
      while(t.getNext().getNext()!=null){
        t=t.getNext();
      }
      t.setNext(null);
      size--;
    }
  }
  public void deleteAtPos(int pos){
    if(isEmpty()||pos>size||pos<1){
      System.out.println("Deletetion not possible");
      return;
    }
    else if(pos==1){
      deleteFirst();
    }
    else if(pos==size){
      deleteLast();
    }
    else{
      Node t=start;
      Node t1;
      for(int i=1; i<pos-1;i++){
        t=t.getNext();
      }
      t1=t.getNext();
      t.setNext(t1.getNext());
      t1.setNext(null);
      size--;
    }
  }

  
}
