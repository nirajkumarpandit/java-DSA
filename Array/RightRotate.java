package Array;

import pratics.reverse;

public class RightRotate {
    static void reverse(int arr[], int start, int end ){
        while (start<=end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }
    static void LeftRotate(int arr[], int n, int k){
        reverse(arr, 0, k-1);
        reverse(arr, n-k-1, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n= arr.length;
        int k=3;
        LeftRotate(arr, n, k);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }

    }
}
