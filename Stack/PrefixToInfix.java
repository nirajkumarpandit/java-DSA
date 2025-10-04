package Stack;
import java.util.Stack;
public class PrefixToInfix {
    public static String prefixToInfix(String str){
        Stack<String> st=new Stack<>();
        int i=str.length()-1;
        // step 1--> star iterating at last
        while(i>=0){
            char ch=str.charAt(i);
            // step 2--> operands push in stack and operator place in between them
            if(Character.isLetterOrDigit(ch)){ //check (ch) कोई letter (A-Z, a-z) या digit (0-9) है या नहीं
                st.push(String.valueOf(ch)); // convert character into string
            }
            // place operator between to top element
            else{
                String t1=st.pop();
                String t2=st.pop();
                st.push('('+t1+ch+t2+')');
            }
            i--;
        }
        return st.peek();
        
    }
    public static void main(String[] args) {
        String str="*+PQ-MN";
        System.out.println(prefixToInfix(str));
    }
}
