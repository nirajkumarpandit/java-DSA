package pratics;
import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // boolean istrue=true;
        while (n>0) {
            int lastdig=n%10;
            System.out.print(lastdig);
            n /=10;
        }
        sc.close();

    }
}
