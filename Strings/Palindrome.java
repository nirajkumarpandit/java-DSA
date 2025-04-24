package Strings;


public class Palindrome{
    public static boolean isPalindrome(String str){
        int n= str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){ // compair first element and last element ans so on ;
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str=new String("racecar");
        System.out.println(isPalindrome(str));

    }
}