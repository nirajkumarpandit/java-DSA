package Array;
public class LeftRotate {
    // left rotate by one 
    static void leftRotate(int arr[]){
        int temp=arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i]; // for shifting the element
        }
        arr[arr.length-1]=temp;

    }
    // for print the array
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        leftRotate(arr);
        print(arr);
    }
}
