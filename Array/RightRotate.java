package Array;

// optimal solution
public class RightRotate {

    static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // left rotation
    static void LeftRotate(int arr[], int n, int k) {
        // reverse the k th element
        reverse(arr, 0, k - 1);
        // reverse the othe element
        reverse(arr, n - k - 1, n - 1);
        // reverse the whole array
        reverse(arr, 0, n - 1);
    }

    // right rotation
    static void rightRotation(int arr[], int n, int k) {
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;
        LeftRotate(arr, n, k);
        System.out.println("Left rotate the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        rightRotation(arr, n, k);
        System.out.println("right rotate the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
