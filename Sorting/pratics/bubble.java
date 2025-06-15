package Sorting.pratics;

public class bubble {
    // bubble sort 
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){  // calculate the number of turns n-1 
            for(int j=0; j<arr.length-1; j++){   
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    // print function for array
    public static void print(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2,0};
        bubbleSort(arr);
        print(arr);
    }
}
