package Queue;
import java.util.*;
public class Interleave {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        // claculate the size of queue
        int size=q.size();
        //store element in first queue is size/2
        Queue<Integer> firstHalf=new LinkedList<>();
        for(int i=0; i<size/2; i++){
            firstHalf.add(q.remove());
        }
        // interleave the element
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());  // first half se remove and queue me store 
            q.add(q.remove()); // queue se remove q me add
        }
        // print the queue
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
