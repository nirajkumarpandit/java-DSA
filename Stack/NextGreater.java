package Stack;
import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        Stack<Integer> s= new Stack<>();
        // backword loop
        for(int i=arr.length-1; i>=0; i--){
            // step 1
            // check stack[top]<=arr[i] --> pop()
            while(! s.isEmpty() && arr[s.peek()]<=arr[i]){ //s.peek()-->index no. then compair hoga 
                s.pop();                                    // stack me index store hoga
            }
            // step 2
            if(s.isEmpty()){
                nextGreater[i]= -1; // rigth me koi next greater element nahi hai
            }else{
                nextGreater[i]=arr[s.peek()]; // agar koi hai to use add kar do
            }                                   // s.peek()--> se index milta hai 
            // step 3
            s.push(i); // index push in stack
        }

        // print function
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }

    }
}
