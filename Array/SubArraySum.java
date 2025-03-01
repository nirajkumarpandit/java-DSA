package Array;

public class SubArraySum {

    // brout force approach
    public static void maxSum(int arr[]){    // time complexity O(n^3)
        int maxSum=Integer.MIN_VALUE;         // space complexity O(1)
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){ //for start 
                int current=0;
                for(int k=i; k<=j; k++){   // for end
                    current +=arr[k];
                }
                if(maxSum<current){
                    maxSum=current;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void maxSubArraySum(int arr[]){
        
    }
    // optimal approach
    // kadane algorithm
    public static void kadane_s(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args){
        int arr[]={1,3,-4,5,-6};
        maxSum(arr);
        System.out.println("kadane_s algorithm :");
        kadane_s(arr);
    }
}
