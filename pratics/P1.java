package pratics;
import java.util.*;
public class P1{
    // binary search 
    public static int BinSearch(int arr[], int target){
        int st=0;
        int end=arr.length-1;
        while (st<=end) {
            int mid=(st+end)/2;
            if(arr[mid]==target){
                
                return mid;
            }
            if(arr[mid]<target){
               st= mid+1;
            }else{
                end=mid--;
            }
        }
        return -1;
    }
    // input from user 
    public static void inputArray(int arr[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    // find largest element in array
    public static void largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The maximum value :"+max);
    }
    // minimum value in array
    public static void minimum(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum value :"+min);
    }
    // print function of array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[4];
        System.out.println("Enter the array element :");
        inputArray(arr);
        largest(arr);
        minimum(arr);
        int target=6;
        System.out.println(BinSearch(arr, target));
    }
   
}