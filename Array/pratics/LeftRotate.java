package Array.pratics;

public class LeftRotate {
    // left rotate by one
    public static void leftRotateByOne(int arr[]) {
        // store the first element
        int temp = arr[0];
        // shift the element one possition to the left
        if (arr == null || arr.length <= 1)
            return; // handle edge cases
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        // place the first element at the end
        arr[arr.length - 1] = temp;
    }

    // left rotate by k position
    public static void leftRotate(int arr[], int k) {
        // brute force approach
        k = k % arr.length; // calculate the number of ratation
        // Step 1: Copy first k elements
        if (arr == null || arr.length <= 1)
            return; // base case
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

       // Step 2: Shift remaining elements to the left
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }
         // Step 3: Copy temp elements to the end
        for (int i = 0; i < k; i++) {
            arr[arr.length -k +i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // leftRotateByOne(arr);
        leftRotate(arr, 6);
        // print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
