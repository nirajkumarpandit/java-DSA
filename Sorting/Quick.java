package Sorting;

public class Quick {
    public static void quickSort(int arr[], int si, int ei){
        // base case 
        if(si>=ei){
            return; 
        }
        //call partition
        int pIdx=partition(arr, si, ei);
        // recursive call for left and right part
        quickSort(arr, si, pIdx-1); //left
        quickSort(arr, pIdx+1, ei);  //right
    }
    // partition 
    public static int partition(int arr[], int si, int ei)
    {
        // last element as a pivort element
        int pivort=arr[ei];
        int i=si-1;
        for(int j=si; j<ei;j++){
            if(arr[j]<=pivort){
                i++;
                // swap 
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
         int temp=pivort;
          arr[ei]=arr[i];
          arr[i]=temp;      
        return i;
    }
    // print function 
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={2,5,1,5,8,1,0,8};
        quickSort(arr, 0, arr.length-1);
        print(arr);
        
    }
}
