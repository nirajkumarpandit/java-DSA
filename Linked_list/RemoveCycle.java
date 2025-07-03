package Linked_list;

public class RemoveCycle {
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
    // detect cycle exist or not
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next !=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow== fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        // detect the loop 
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast.next !=null && fast !=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow== fast){
                cycle =true;
                break;
            }
        }
        // find the meeting point 
        slow=head;
        Node prev= null;
        if(cycle== true){
            while (slow !=fast) {
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            // lastNode point to null
            prev.next=null;
        }
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        temp.next=new Node(3);
        temp.next.next=new Node(4);
        temp.next.next.next=temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        
    }
}
