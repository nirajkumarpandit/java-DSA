package Linked_list;

public class Remove {
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
    static int size=0;
    public void add(int idx,int data){
        // create a newNode
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        Node temp=head;
        int i=0; 
        while(i< idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        return;
    }
    // print function
     public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
     }

     // remove at any index

     public void remove(int idx){
       // calculate the size of linkedlist
        // Node temp=head;
        // int size=0;
        // while(temp !=null){
        //     temp=temp.next;
        //     size++;
        // }
        // base case
        if(size==0){
            System.out.println("linkedlist is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            return;
        }
        int i=0; 
        if(i==idx){
            head=head.next;
            size--;
            return;
        }
        Node prev=head;
        while (i<idx-1) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;

     }
     // remove Nth node from end
     public void removeEnd(int idx){
        // base case
         if(size==0){
            System.out.println("linkedlist is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            return;
        }
        int i=1; 
        if(size==idx){
            head=head.next;
            size--;
            return;
        }
        Node prev=head;
        int idxFromEnd=size-idx;
        while(i<idxFromEnd){
            prev=prev.next; 
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;
     }
    public static void main(String[] args) {
        Remove ll=new Remove();
        ll.add(0, 1);
        ll.add(1, 2);
        ll.add(2, 4);
        ll.add(3, 3);
        ll.add(4, 5);
        ll.print();
        // ll.remove(0);
        ll.removeEnd(5);
        ll.print();

        System.out.println(ll.size);
    }
}
