package Sorting;

public class Bubble {
    // Bubble sort algorithm 
    public static void BubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            boolean swap=false;
            for(int j=0; j<arr.length-1-turn; j++){      // Time lcomplexity O(n^2)
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                // array is already sorted
                break;
            }
        }
    }
    // print the sorted array
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        BubbleSort(arr);
        // print(arr);


    }
}
