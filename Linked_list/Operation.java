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
    int size=0;
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
        // create a node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
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

     // Linear search on linked list
      public int linearSearch(int target){
        Node temp =head;
        int i=0;
        while (temp !=null) {
            if(temp.data== target){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
      }
      // search  using recursion
      public int search(Node head, int target){
        // base case 
        if(head==null){
            return -1;
        }
        if(head.data==target){
            return 0;      
        }
        int idx=search(head.next,target); // recursive call for next head
        if(idx==-1){      
            return -1;
        }
        return idx+1;
      }

      // reverse of a linked list
      public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
        }
        head=prev;
      }
      // remove the n th index
      public void remove(int n){
        // calculate the size of linkedlist
        // int size=0;
        // Node temp=head;
        // while(temp !=null){
        //     temp=temp.next;
        //     size++;
        // }
        // if head remove
        int i=0;
        if(i==n){
            head=head.next;
            return;
        }
        Node prev=head;
        while (i <n-1) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;
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
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        ll.print();
        // ll.reverse();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println("the element found at index :"+ ll.search(head, 11));
        System.out.println("this is the remove nth index operation");
        ll.remove(2);
        ll.print();
    }
}
