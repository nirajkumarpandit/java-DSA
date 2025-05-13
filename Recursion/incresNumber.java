package Recursion;

public class incresNumber {
    public static void incNum(int n){
        // base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        // first recursive call the print the number
        incNum(n-1);
        // print the numbers
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        incNum(n);
    }
}
