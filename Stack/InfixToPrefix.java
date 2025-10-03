package Stack;

import java.util.Stack;

public class InfixToPrefix {
    // reverse String
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0, j = sb.length() - 1;
        while (i < j) {
            // Flip brackets before swapping
            char left = flipBracket(sb.charAt(i));
            char right = flipBracket(sb.charAt(j));

            // Swap flipped characters
            sb.setCharAt(i, right);
            sb.setCharAt(j, left);
            i++;
            j--;
        }

        // If odd length, flip middle character
        if (i == j) {
            sb.setCharAt(i, flipBracket(sb.charAt(i)));
        }

        return sb.toString();
    }

    // Helper to flip brackets
    public static char flipBracket(char ch) {
        if (ch == '(')
            return ')';
        else if (ch == ')')
            return '(';
        else
            return ch;
    }

    // priority function
    public static int priority(char op) {
        if (op == '^')
            return 3;
        else if (op == '*' || op == '/')
            return 2;
        else if (op == '+' || op == '-')
            return 1;
        else
            return 0;
    }

    public static String infixToPrefix(String str) {
        // step 1 --> reverse the string
        str = reverse(str);
        // step 2 --> infix to postfix conversion
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            // operands
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                ans.append(ch);
            }
            // opening bracket
            else if (ch == '(') {
                st.push(ch);
            }
            // closing
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if(!st.isEmpty()) st.pop();
            }
            // operator
            else {
                if (ch == '^') {
                    while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                        ans.append(st.pop());
                    }
                } else {
                    while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                        ans.append(st.pop());
                    }
                }
                st.push(ch);
            }
            i++;
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        String result = reverse(ans.toString());
        return result;

    }

    public static void main(String[] args) {
        String s = "(A+B)*C-D+F";
        System.out.println(infixToPrefix(s));
    }
}
