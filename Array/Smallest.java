package Array;

public class Smallest {
    static int small(int arr[]){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={2,-15,7,-9,9};
        System.out.println(small(arr));
    }
}
