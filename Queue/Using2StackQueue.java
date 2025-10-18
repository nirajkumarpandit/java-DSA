package Queue;
import java.util.*;
public class Using2StackQueue {
    public static class Queue{
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        // isEmpty
        public boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }
        // add
        public void add(int data){
            s1.push(data);
        }
        // remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
