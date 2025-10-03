package Stack;
import java.util.Stack;
public class InfixToPostfix {
   public static int priority(char op) {
    if(op == '^') return 3;       // Highest precedence
    else if(op == '*' || op == '/') return 2;
    else if(op == '+' || op == '-') return 1;
    else return 0;                // For '(' or invalid characters
}
    public static String infixToPostfix(String s){
        Stack<Character> st=new Stack<>();
        int i=0; 
        StringBuilder ans=new StringBuilder("");
        while(i<s.length()){
            char ch=s.charAt(i);
            // operand
            if((ch>='a' && ch<='z') || (ch>='A'&& ch<='Z')|| (ch>='0'&& ch<='9')){
               ans= ans.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            //closing 
            else if(ch==')'){
                while(!st.isEmpty()&& st.peek()!='('){
                    ans=ans.append(st.pop());  //answer me add kar ke pop kar denge
                }
                if(!st.isEmpty()){  //'(' को remove करो, postfix में add नहीं करना है
                    st.pop();
                }
            }// operator
            else{
                while (!st.isEmpty() && priority(ch)<=priority(st.peek())) {
                    ans=ans.append(st.pop());
                }
                st.push(ch);
            }
            i++;
        }
        while(!st.isEmpty()){
            ans=ans.append(st.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="a+b*(c^d-e)";
        System.out.println(infixToPostfix(s));

    }
}
