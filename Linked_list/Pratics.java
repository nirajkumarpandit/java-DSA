package Linked_list;

public class Pratics {
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
        // step 2 newNodeka next head ko point kare
        newNode.next=head;
        // step 3 newNode ko head bana do
        head=newNode;
    }
    public  void addlast(int data){
        // step 1 create a node 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 tail ka next newNode ko point kare
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;  // temparary node jo head per hai
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;   // temp ka next node
        }
    }
    public static void main(String[] args) {
        Pratics pp=new Pratics();
        pp.addFirst(3);
        pp.addlast(4);
        pp.addFirst(9);
        pp.addlast(8);
        pp.print();

    }
}
