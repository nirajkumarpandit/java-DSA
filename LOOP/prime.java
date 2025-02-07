package LOOP;
import java.util.*;
public class prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        boolean isTrue=true;
        for(int i=2; i<n-1; i++){
            if (n%i==0) {
               isTrue=false;
            }
           
        }
        if(isTrue==true){
            System.out.println("prime number");
        }else{
            System.out.println("not prime no.");
        }
        sc.close();
    }
}

