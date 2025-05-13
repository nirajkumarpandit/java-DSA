package Recursion;

public class DecNumber {
    public static void printDec(int n){
        // base case to stop the recursive call 
        if(n==1){
            System.out.print(n);
            return;
        }
        // print the decreasing number
        System.out.print(n+" ");
        // recursive call 
        printDec(n-1);
    }
    public static void main(String args[]){
        int n=10;
        printDec(n);
    }
}
