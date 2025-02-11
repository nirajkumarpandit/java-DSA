package Linked_list;

public class First {
    public static void main(String[] args) {
        Node n=new Node(3);
        System.out.println("data ="+ n.data +" address ="+ n.next);
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}