package Array;

public class Smallest {
    public static int small(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[]={2,-15,7,-9,9};
        System.out.println(small(arr));
    }
}
