package function;

import java.util.Scanner;

public class Allprime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void Primeinrange(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        Primeinrange(n);
        sc.close();
    }
}
