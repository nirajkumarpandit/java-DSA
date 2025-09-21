package Array;
public class MoveZero {
    // brute force approach
    public static void moveZeroAtLast(int arr[]){
        // create a new temp array and store non zero element
        int temp[]=new int[arr.length];
        int index=0; // for temp index 
        for(int i=0;i<arr.length; i++){
            if(arr[i] !=0){
                temp[index]=arr[i];
                index++;
            }
        }
        //copy all element in original array
        // rest place in arry automatic add zero
        for(int i=0; i<temp.length; i++){
            arr[i]=temp[i];
        }
    }
    // using two pointer approach
    public static void moveZero(int arr[]){
        // find first zero in array
        int j=0; 
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1; i<arr.length; i++){
            if(arr[i] !=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,0,4,0,6,0,8,7,6,0};
        // moveZeroAtLast(arr);
        moveZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}