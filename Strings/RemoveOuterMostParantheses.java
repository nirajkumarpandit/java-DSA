package Strings;

public class RemoveOuterMostParantheses {
    public static void main(String[] args) {
        String s="(()())(())";
        // store the ans
        StringBuilder ans= new StringBuilder();
        int level=0;
        for(int i=0; i<s.length(); i++){
            //if opening brecket 
            if(s.charAt(i) =='('){
                if(level>0) ans.append(s.charAt(i));  // Time complexity =O(n) ,space =O(1)
                level++;
            }else if(s.charAt(i)==')'){
                level--;
                if(level>0) ans.append(s.charAt(i));
            }
        }
        System.out.println(ans.toString());
    }
}
