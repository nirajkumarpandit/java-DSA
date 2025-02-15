package Array;

public class BinarySearch {
    public static int BinSearch(int arr[], int target){
        int st=0;
        int end=arr.length;
        while (st<=end) {
            int mid=(st+end)/2;
            if(arr[mid]==target){
                
                return mid;
            }
            if(arr[mid]<target){
               st= mid+1;
            }else{
                end=mid--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,68,9};
        int target=9;
       System.out.println(BinSearch(arr, target));
    }
}
