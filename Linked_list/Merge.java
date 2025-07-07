package Linked_list;

public class Merge {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    // find the mid point 
     public static Node getMid(Node head){
        Node slow=head;
        Node fast =head.next;
        while (fast !=null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid point of linked list 
     }

     // merge the linked list 
     public static Node merge(Node head1, Node head2){
        Node mergeLL =new Node(-1); // dummy node 
        Node temp= mergeLL;
        while (head1 !=null && head2 !=null) {
            if(head1.data <=head2.data){
                temp.next= head1;
                head1=head1.next;
                temp= temp.next;
            } else {
                temp.next= head2;
                head2= head2.next;
                temp =temp.next;
            }
        }
        while (head1 !=null) {
            temp.next= head1;
                head1=head1.next;
                temp= temp.next;
        }
        while (head2 !=null) {
             temp.next= head2;
                head2= head2.next;
                temp =temp.next;
        }
        return mergeLL.next;
     }
    public static Node mergeSort(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
        }
        // mid  
        Node mid= getMid(head);
        // divide left or right part
        Node rightHead= mid.next;
        mid.next= null;
        Node newLeft= mergeSort(head);
        Node newRight =mergeSort(rightHead);
        // megre 
        return merge(newLeft, newRight);
    }
    // print function
     public static void print(){
        Node temp=head;
        while (temp !=null) {
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.print("null");
        System.out.println();
     }
    public static void main(String[] args) {
         head= new Node(3);
         head.next=new Node(1);
          head.next.next=new Node(23);
           head.next.next.next=new Node(0);
           print();
          head =  mergeSort(head);
           print();
    }
}
