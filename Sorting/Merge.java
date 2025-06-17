package Sorting;

public class Merge {
//  merge sort function it is a divide and conqure approach
    public static void mergeSort(int arr[], int si,int ei){
        // base case 
        if(si>=ei){
            return;
        }
        // first divide the array and calculate the mid 
        // for mid
        int mid=si+(ei-si)/2;
        // recursive call for left part
        mergeSort(arr, si, mid);
        // recursive call for right part
        mergeSort(arr, mid+1, ei);
        // after divide merge the array 
        // call the merge function
        merge(arr, si, mid, ei);
    }
    // megre function 
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//itterator for left part
        int j=mid+1; // itterator for right part
        int k =0; // itterator for temp arrau
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++; 
                k++;
            }
        }
        // left part me bache element ko add
         while(i<=mid){
            temp[k++]=arr[i++];
         }

         // for right part me bache element ke liye
         while(j<=ei){
            temp[k++]=arr[j++];
         }
         // copy element from temp array to original array
         for(k=0, i=si; k<temp.length; k++, i++){
             arr[i]=temp[k];
         }

    }
    // print function 
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,9,4,0,2,3};
        mergeSort(arr, 0, arr.length-1);
        print(arr);

    }
}
