package Recursion.pratics;

public class Basic {
    // print decreasing number using Recursion
    public static void decNumber(int n) {
        // base condition
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " "); // first print the number and call decNumber function
        decNumber(n - 1); // if you want to print the inceasing number
    }
    // first call the decNumber function and after that print the number

    /************** Factorial number *************/
    public static int fact(int n){
        // base case
        if(n==0){
            return 1;
        }
        int f1= fact(n-1);
        int factorial=n*f1;
        return factorial;
    }
    // **********************checking the the array is sorted or not**********

    public static boolean isSorted(int arr[],int i){
        //base case
        if(arr[i]==arr.length){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    
    public static void main(String args[]){
        // int n=5;
        // decNumber(n);
        // System.out.println("calling factorial function = "+fact(n));
        int arr[]={1,2,3,4,1};
        System.out.print(isSorted(arr, 0));
        
    }
}
