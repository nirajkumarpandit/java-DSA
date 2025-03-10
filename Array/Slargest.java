package Array;

public class Slargest {
    // beeter approach
    static int secodLargest(int arr[]) {
        // first find the largest element
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // calculate second largest element
        // start from the second last element
        int slargest = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        return slargest;

    }

    // Optimal approach
    static int secLargest(int arr[]) {
        // first create two variable
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest; // slargest update with largest
                largest = arr[i]; // and update the largest value
            } else if (arr[i] < largest && arr[i] > slargest) { // if largest is small but second largest is big the
                                                                // update second largest
                slargest = arr[i];
            }
        }
        return slargest;
    }
    // *** second minimum number 
    static int sMinimum(int arr[]){
        int min=arr[0];
        int smin=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<smin){
                smin=arr[i];
            }
        }
        return smin;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 17, 8 };
        // for better approach 
        System.out.println(secodLargest(arr)); // time complexity is O(2n)
        // for optimal approach
        System.out.println(secLargest(arr)); // Time complexity is O(n)

        // second smallest number 
        System.out.println(sMinimum(arr));


    }

}
