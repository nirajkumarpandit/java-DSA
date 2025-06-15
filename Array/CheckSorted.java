package Array;
// brute force approach
public class CheckSorted {
    static boolean Sorted(int arr[]){
        for(int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    // optimal approach 
    static boolean isSorted(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,14,52};
        System.out.println(isSorted(arr));
    }
}
