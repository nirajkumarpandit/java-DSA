package function;
import java.util.*;
public class palindrome {
    public static boolean isPalindrome(long n){
       long palindrome=n;
       long reverse=0;
       while(n!=0){
        long lastdig = n%10;
        reverse=reverse*10+lastdig;
         n/=10;
       }
       if(palindrome==reverse){
        return true;
       }
       else{
        return false;
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        long n=sc.nextLong();
        if(isPalindrome(n)){
            System.out.println(" Number : "+ n + " is a palindrome");
        }
        else{
            System.out.println("not ");
        }
        sc.close();
    }
}
