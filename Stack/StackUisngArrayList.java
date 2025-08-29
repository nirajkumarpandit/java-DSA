package Stack;
import java.util.ArrayList;
    
public class StackUisngArrayList {
    static class Stack {
        // create a arrayList
        static ArrayList<Integer> list= new ArrayList<>();
        // isEmpty
        public static boolean isEmpty(){
            return list.size()==0;
        }
        // push function
        public static void push(int data){
            list.add(data);
        }
        // pop function
        public static int pop(){
            // base case 
            if(isEmpty()){
                return -1;  // agar isEmpty true hota hai to
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peak function
        public static int peak(){
             // base case 
            if(isEmpty()){
                return -1;  // agar isEmpty true hota hai to
            }
            return list.get(list.size()-1);
        }
    }
    
    public static void main(String args[]){
      Stack s=new Stack();
      s.push(1);
      s.push(2);
        // print statement 
        while (!s.isEmpty()) {
            System.out.println(s.peak());
             s.pop();
        }
    }
}
