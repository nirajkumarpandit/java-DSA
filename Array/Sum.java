package Array;

public class Sum {
    // sum of array element
    public static int arraySum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4};
        System.out.println(arraySum(arr));
    }
}
