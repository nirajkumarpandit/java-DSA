package Stack;
import java.util.Stack;
public class PostfixToPrefix {
    public static String postfixToPrefix(String str){
        Stack<String> st=new Stack<>();
        int i=0; 
        while (i<str.length()) {
            char ch=str.charAt(i);
            // operand and number push in stack
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            // operator
            else{
                String t1=st.pop();
                String t2=st.pop();
                st.push(ch+t2+t1);
            }
            i++;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String str="AB-DE+F*/";
        System.out.println(postfixToPrefix(str));
    }
}
