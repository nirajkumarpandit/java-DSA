package Sorting;

public class SelectionSort {
    public static void Selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
            
        }
    }
    // printing the sorted element
    public static void print(int arr[]){
        for(int i=0; i< arr.length; i++){
           System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,1,9,6};
        Selection(arr);
        print(arr);
        
    }
}
