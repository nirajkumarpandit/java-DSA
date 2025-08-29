package Stack;

import java.util.Stack;

public class PushAtBottom {
    // push at bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // store top and pop elment
        int top = s.pop();
        // call recursive
        pushAtBottom(s, data);
        // push poped element
        s.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        while(! s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
}
