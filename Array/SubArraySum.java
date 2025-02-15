package Array;

public class SubArraySum {
    public static void maxSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int current=0;
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    current +=arr[k];
                }
                if(maxSum<current){
                    maxSum=current;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int arr[]={1,3,4,5,6};
        maxSum(arr);
    }
}
