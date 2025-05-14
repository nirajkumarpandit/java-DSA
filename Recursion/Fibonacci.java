package Recursion;

public class Fibonacci {
    public static int fib(int n) {
        // base case
        if (n == 0 || n==1) {
            return n;
        }
        
        // calculate Nth term fibonacci 
        int fibNm1=fib(n-1);
        int fibNm2= fib(n-2);
        int fibN=fibNm1+fibNm2;
        return fibN;
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.print(fib(n));
    }
}
