package Linked_list;
import java.util.LinkedList;
public class FrameWork {
    public static void main(String[] args) {
        LinkedList <Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.add(3);
        System.out.println(ll);
        // remove 
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
    
}
