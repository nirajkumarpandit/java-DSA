package Array;

public class Largest {
    public static int  big(int arr[]){
     int largest=arr[0];
     for(int i=0; i<arr.length; i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
     }
     return largest;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,800,9};
        System.out.println(big(arr));
    }
}
