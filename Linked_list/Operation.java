package Linked_list;

public class Operation {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    int size;
    // add at first position 
    public void addFirst(int data){
        // create a newnode
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next =head;
        head=newNode;
        size++;

    }
    // add last
    public void addlast(int data){
        if(head==null){
            System.out.println("null");
            return;
        }
        // create a node
        Node newNode=new Node(data);
        Node temp=head;         // traverse karke tail tak jao then add karo
        for(int i=0; i<size-1; i++){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode=null;
        size++;

    }
    // add any position
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        // create a node 
        Node newNode=new Node(data);
        Node temp=head;
        int prev=0;
        while(prev <idx-1){
            temp=temp.next;
            prev++;
        }
        // when prev reach
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        
    }
    // print the linked list
    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        } 
        System.out.print("null");
        System.out.println();
    }


    // remove operation
     public void removeFirst(){
        if(size==0){
            System.out.println("null");
            return;
        }
        head=head.next;
        size--;
     }
     // remove last
     public void removeLast(){
        if(size==0){
            System.out.println("null");
            return;
        }
        if(size==1){
            head=tail=null;
            return;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
     }
    public static void main(String[] args) {
        Operation ll=new Operation();
        ll.addFirst(3);
        ll.addlast(8);
        ll.addFirst(1);
        ll.addlast(9);
        ll.add(2, 5);
        ll.add(1, 0);
        ll.addFirst(11);
        ll.addlast(32);
        System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
