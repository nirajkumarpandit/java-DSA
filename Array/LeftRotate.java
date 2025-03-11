package Array;
public class LeftRotate {
    // left rotate by one 
    static void leftRotate(int arr[]){
        int temp=arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i]; // for shifting the element
        }
        arr[arr.length-1]=temp;

    }
    //*** if give the no. of element are shifted  */
    // Brute force approach
     static void leftRotate(int arr[], int d){
        // calculate the no. of rotation 
        d= d%arr.length;
        // create a temp array and store the elements are rotated
        int temp[]=new int[d];
        for(int i=0; i<d; i++){
            temp[i]=arr[i];
        }
        // shifting the array element
        for(int i=d; i<arr.length; i++ ){
            arr[i-d]=arr[i];
        }
        // put back the temp element in the array in vacent position
        // vacent position = size of array - d
        for(int i= arr.length-d; i<arr.length; i++){
            arr[i]=temp[i-(arr.length-d)];
        }
     }

    // for print the array
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        // leftRotate(arr);
        leftRotate(arr, 3);
        print(arr);
    }
}
