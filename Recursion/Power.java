package Recursion;

public class Power {
    // print x^n in Time complexity of O(n)
    public static int pow(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // calculate pow(x, n-1)
        // int pnm1 =pow(x, n-1);
        // int xn=x*pnm1;
        // return xn;
        return x * pow(x, n - 1);
    }

    // print x^n in time complexity of O(logn)

    public static int power(int n, int x) {
        // base case
        if (n == 0) {
            return 1;
        }
        // calculate half power
        int halfPower = power(n / 2, x);
        int halfPowerSq = halfPower * halfPower;
        // if n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        // System.out.println(pow(2, 5));
        System.out.println(power(5, 2));
    }
}
