package Linked_list;

public class Remove {
    public static class Node{
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
        int idxFromEnd=size-idx-1;
        while(i<idxFromEnd){
            prev=prev.next; 
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;
     }


     // check palindrome or not


     public boolean palindrome(){
        // base case
         if(head==null || head.next==null){
            return true;
         }
        // step 1\ find the mid of linkedlist
        // using the slow fast concept
        Node slow=head;
        Node fast=head;
        Node mid;
        while (fast !=null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        // step 2 reverse the 2nd part 
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; // right ka head
        Node left=head;
        //  step 3 check left half & right half 
        if(right !=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
     }

     // check cycle exist or not 
     public static boolean isCycle(){
        // using the slow fast approach
        Node slow=head;
        Node fast=head;
        while (slow !=null && fast.next !=null) {// when no cycle 
            slow=slow.next;
            fast=fast.next.next;
            if(slow== fast){ // when cycle exist
                return true;
            }
        }
        return false;
     }
    public static void main(String[] args) {
        // Remove ll=new Remove();
        // ll.add(0, 1);
        // ll.add(1, 2);
        // ll.add(2, 2);
        // ll.add(3, 1);
        // ll.print();
        // // ll.remove(0);
        // // ll.removeEnd(0);
        // ll.print();
        // System.out.println(ll.palindrome());

        // static function ka object nahi banana hota hai
        head =new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(isCycle());
    }
}
