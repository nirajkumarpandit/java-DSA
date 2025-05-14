package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int arr[],int i, int key){
        // base condition 
        if(arr[i]==arr.length){
            return -1;
        }
        // check arr[i]=key the print index number 

       if(arr[i]==key){
        return i;
       }
       // recursive call for next index

       return firstOccurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={5,2,66,4,4,49,9,9};
        System.out.println(firstOccurence(arr, 0, 9));
    }
}
