package Stack.pratics;
import java.util.Stack;
public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s,int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // reverse stack using recursion
    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }
    // print function
    
    public static void print(Stack<Integer>s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
       }
    }
    public static void main(String[] args) {
       Stack<Integer> s=new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       pushAtBottom(s, 4);
       reverse(s);
       print(s);
       
    }
}
