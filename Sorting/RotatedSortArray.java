package Sorting;
public class RotatedSortArray{
    // Rotated sorted array search 
    // in this problem apply the binary search because it is sorted array
    public static int rotatedSearchArray(int arr[], int target){
        // first i find the mid 
        int si=0; int ei=arr.length-1;
        while (si<=ei) {
            int mid= si+(ei-si)/2;
            // check which part is sortd either left or right
            //if our target present in the mid 
            if(arr[mid]== target){
                return mid;
            }

            // if left part sorted
            if(arr[si]<=arr[mid]){
                if(arr[si]<=target && target<=arr[mid]  ){
                    ei=mid-1; // right part eleminated
                }
                else{
                    si=mid+1; // left part eleminated
                }
            }
            // if right part is sorted
            else{
                if(arr[mid]<=target && target <=arr[ei]){
                    si= mid+1; // left part eleminated
                }
                else{
                    ei=mid-1; // right part eleminated
                }

            }
        }
        return -1; // in case not present in the array
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        int target=7;
        System.out.println(rotatedSearchArray(arr, target));
    }
}