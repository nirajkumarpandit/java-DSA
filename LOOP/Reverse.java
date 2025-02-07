package LOOP;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        while (num>0) {
            int lastdig=num%10;
            System.out.print(lastdig);
            num /=10;
        }
        System.out.println();
        sc.close();
    }
}
