package Recursion;

public class factorial {
    public static int fact(int n){
        // base case
         if(n==0){
            return 1;
         }
         // calculate factorial n-1
         int fnm1= fact(n-1);
         // after calculation calcualte n*f(n-1) and store fn
         int fn= n*fnm1;
         return fn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));
    }
}
