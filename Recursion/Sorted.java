package Recursion;

public class Sorted {
    public static boolean isSorted(int arr[], int i){
        // base case
        if(arr[i]==arr.length-1){
            return true;
        }
        // check i and i+1 arrenge in sorted or not
        if(arr[i]>arr[i+1]){
            return false;
        }
        // recursive call isSorted function
       return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,13,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
