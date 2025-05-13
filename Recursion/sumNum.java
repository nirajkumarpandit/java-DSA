package Recursion;

public class sumNum {
    public static int sumNumber(int n){
        // base case
    if(n==0){
        return 0;
    }
    int fnm1=sumNumber(n-1);
    int fn=n+fnm1;
    return fn;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sumNumber(n));
    }
}
