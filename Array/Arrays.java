package Array;

public class Arrays {
    public static void update(int arr[]){   //update the array element
        for(int i=0; i<arr.length; i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4};
        update(arr);   // updated array is 3,4,5
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
