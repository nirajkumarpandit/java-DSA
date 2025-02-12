package Array;
import java.util.*;

public class Linear {
    public static int LinearSearch(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,7,0};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter target element :");
        int target=sc.nextInt();
        int index=LinearSearch(arr, target);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("Element found at index "+ index);
        }
    }
}
