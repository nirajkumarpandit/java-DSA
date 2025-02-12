package Array;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        // input 
        System.out.println("Enter the element :");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        // output
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
