import java.util.Scanner;
public class age{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the age :");
        short age=sc.nextShort();
        if(age>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you can not vote");
        }
        sc.close();
    }
}