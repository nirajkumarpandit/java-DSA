import java.util.*;
public class week {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter week number: ");
        int week=sc.nextInt();
        switch(week){
            case 1: System.out.println("MONDAY");
            break;
            case 2:System.out.println("TUESDAY");
            break;
            default:System.out.println("Enter vailide number");
        }
        sc.close();
    }
}
