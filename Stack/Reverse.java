package Stack;
import java.util.*;
public class Reverse{
    // push at bottom
    public static void pushAtbottom(Stack<Integer> s, int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }
    // reverse
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtbottom(s,top);
    }
    // print function
    public static void print(Stack<Integer> s){
        while(! s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        print(s);
    }
}