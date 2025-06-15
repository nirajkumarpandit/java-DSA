package Array.pratics;
public class P1{
    // function for largest element 
    static int largest(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    // function for second largest element 
    static int sLargest(int arr[]){
        int max=arr[0]; int 
        secMax=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            else if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        return secMax;
    }

    // function for check array is sorted or not
    static boolean isSorted(int arr[]){
       for(int i=0; i<arr.length-1; i++){
        if(arr[i]>arr[i+1]){
            return false;
        }
       }
       return true;
    }

    // function for remove the duplicates in place from sorted array
    static int removeDuplicates (int arr[]){
        int j=0;
        for(int i=1; i<arr.length; i++){
            if(arr[j]!=arr[i]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,3,3,3,4,4,4,4,5,5,5,5,5,6};
        //  System.out.println(sLargest(arr));
        // System.out.println(isSorted(arr));

        //remove duplicates in sorted array
        int newLength = removeDuplicates(arr);

        System.out.println("After removing duplicates:");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
     }
}