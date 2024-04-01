package linklist;
import java.util.*;


public class SinglyLL{

    puplic static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();

        boolen flag = true;
        int valu;
        int posi = 0;

        while(flag){
            System.out.println();
			System.out.println("1. Add item to the list at start");
			System.out.println("2. Add item to the list at last");
			System.out.println("3. Add item to the list at position");
			System.out.println("4. Delete First node");
			System.out.println("5. Delete last node");
			System.out.println("6. Delete node at position");
			System.out.println("7. Update node at position");
			System.out.println("8. Reverse link list");
			System.out.println("9. View List");
			System.out.println("10. Get List Size");
			System.out.println("11. Exit");
			System.out.println();
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1: System.out.println("Enter value");
				valu=sc.nextInt();
				list.insertAtFirst(valu);
			break;
			
			
			case 2: System.out.println("Enter value");
				valu=sc.nextInt();
				list.insertAtLast(valu);
			break;
			
			
			case 3: System.out.println("Enter value");
			valu=sc.nextInt();
			System.out.println("Enter position");
			posi=sc.nextInt();
			list.insertAtPos(valu,posi);
			break;
			
			case 4: 
			list.deleteFirst();
			break;
			
			case 5: 
				list.deleteLast();
				break;
				
			case 6: 
			System.out.println("Enter position");
			posi=sc.nextInt();
			list.deleteAtPos(posi);
			break;
			
			case 7:System.out.println("Enter value");
			valu=sc.nextInt();
			System.out.println("Enter position");
			posi=sc.nextInt();
			list.updateData(valu,posi);
			break;
			
			case 8:list.reverseList();
			break;
			
			case 9: list.viewList();
			break;
			
			case 10: System.out.println(list.getListSize());
			break;
			
			case 11: flag=false;
			break;
			
			
			
			default: System.out.println("invalid choice");
        }

    }
}

class LinkedList{
    class Node{
        private int data;
        private Node next;

        public Node(){
            data=0; next= null;
        }
        public void setData(int d){
            data=d; 
        }
        public void setNext(Node n){
            next=n;
        }
        public int getData(){
            return data;
        }
        public Node getNext(){
            return next;
        }
    }

    private Node start;
    private int sizel

    public Linkedlist(){
        start= null;
        size= 0; 
    }

    public void reverseList(){
        Node curr = start;
        Node previous= null;
        Node nex= null;
        while(curr!=null){
            nex= curr.genNext();
            curr,setNext(previous);
            previous=curr;
            curr=nex;
        }
        start=previous;
    }

    public boolen isEmpty(){
        if(start == null){return true;}
        else{return false;}
    }

    public int getListSize(){
        return size;
    }

    public void vieewList(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        Node t= start;
        while(t!=null){
            System.out.print(t.getData()+ "|__|"+"-->");
            t= t.getNext();
        }
        System.out.print("null");
    }
    public void insertAtFrist(int val){
        Node n =new Node();
        n.setData(val);
        if(!isEmpty()){
            n.setNext(start);
        }
        start = n;
        sizze++;
    }
    public void insetAtLast(int val){
        Node t= start;
        Node n= new Node();
        n.setData(val);
        if(t==null) {start=n;}
        else{
            while(t.getNext()!=null){
                t=t.getNet();
            }
            t.setNext(n);
        }
        size++;
    }
    public void insertAtPos(int val. int pos){
        if(isEmpty()|| pos>size||pos<1){
            System.out.println("insertion not possible");
            return;
        }
        else if(pos ==1){
            insertAtFrist(val);
        }
        else if(pos==size){
            insetAtLast(val);
        }
        else{
            Node t=start;
            Node n = new Node();
            n.setData(val);
            for(int i = 1; i<pos-1; i++){
                t= t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
    }
    public void updateDate(int val, int pos){
        if(isEmpty()|| pos>size|| pas<1){
            System.out.println("updation not possible");
            return;
        }
        Node t= start;
        for(int i = 1; i<pos;i++){
            t=t.getNext();
        }
        t.setData(val);
    }
    public void deleteFirst(){
        if(start=null){
            System.out.println("list is empty");
            return;
        }
        else{
            Node t= start;
            start=start.getNext();
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
            Node t= start;
            while(t.getNext().getNet()!=null){
                t=t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }
    public void delelteAtPos(int pos){
        if(isEmpty()||pos>size||pos<1){
            System.out.println("Deletion not possible");
            return;
        }
        else if(pos == 1){
            deleteFirst();
        }
        else if(pos== size){
            deleteLast();
        }
        else{
            Node t=start;
			Node t1;
			for(int i=1;i<pos-1;i++) {
				t=t.getNext();
			}
			t1=t.getNext();
			t.setNext(t1.getNext());
			t1.setNext(null);
			size--;
        }
    }
    
}