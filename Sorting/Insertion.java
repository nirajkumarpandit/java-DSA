package Sorting;

public class Insertion {
    static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int temp= arr[i];  // pick element in unsorted part in compare with sorted part
            int j=i-1;  // this index previous element 
            while(j>=0 && arr[j]>temp){  
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    // for print the array
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2,0};
        insertionSort(arr);
        print(arr);

    }
}
