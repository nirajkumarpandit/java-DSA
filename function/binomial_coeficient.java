package function;

import java.util.Scanner;

public class binomial_coeficient {
    public static int fact(int n){
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial *=i;
        }
        return factorial;
    }
    public static int binomial(int n, int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nMr =fact(n-r);
        return n_fact/(r_fact*(nMr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n :");
        int n= sc.nextInt();
        System.out.println("Enter the r :");
        int r= sc.nextInt();
        System.out.println(binomial(n, r));
        sc.close();
    }
}
