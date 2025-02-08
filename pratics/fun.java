package pratics;
import java.util.*;
public class fun {
    public static int sum(int a, int b){   // a,b parameters or formal parameter
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println( sum(x, y));  // x, y actual or arguments parameters
        sc.close();
    }
}
