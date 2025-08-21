package Array.pratics;
public class L{

    // Q. left rotate by one place

    public static void leftRotateByOne(int arr[]){
        //pick the first element and shift the rest element
        int temp =arr[0];
        // shifting 
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        // put the temp value in the last 
        arr[arr.length-1]=temp;
    }

    // Q. left rotate by k element 
    public static void leftRotate(int arr[], int k){
        int n=arr.length;
        int temp[]=new int[k];
        // brute force approach
        // store the element in temp array
        for(int i=0; i< k; i++){
            temp[i] =arr[i];
        }
        // shifting
        for(int i=k; i<n; i++){
            arr[i-k]=arr[i];
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        leftRotateByOne(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}