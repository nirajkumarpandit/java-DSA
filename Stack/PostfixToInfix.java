package Stack;
import java.util.Stack;
public class PostfixToInfix {
      public static String postfixToInfix(String postfix) {
        Stack<String> s = new Stack<>();
        int n = postfix.length();

        // Traverse the postfix expression from left to right
        for (int i = 0; i < n; i++) {
            char c = postfix.charAt(i);

            // If the character is an operand, push it to the stack
            if (Character.isLetterOrDigit(c)) {  // Character -->built in class hai 
                s.push(String.valueOf(c));      // isLetterOrDigit-->buit in method hai jo check kar raha hai ki (c) कोई letter (A-Z, a-z) या digit (0-9) है या नहीं
            } else {
                // Pop two operands from the stack
                String op2 = s.pop();
                String op1 = s.pop();

                // Form the new infix expression and push back to stack
                s.push("(" + op1 + c + op2 + ")");
            }
        }

        // The final element in the stack is the result
        return s.peek();
    }

    public static void main(String[] args) {
        String str="AB-DE+F*/";
        System.out.println(postfixToInfix(str));
    }
}
