package Linked_list;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    public void addFirst(int data){
        // step 1 create a node 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 new node point to head
         newNode.next=head;
         //step 3 head change
         newNode=head;
         
    }
    public void addLast(int data){
        //step 1 create a node 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 tail ka next newNode ko point kare
        tail.next=newNode;
        //step 3 tail ab newNode ko point karega
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("null");
        }
        Node temp=head;
        while(temp !=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        
    }
}