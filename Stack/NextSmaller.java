package Stack;
import java.util.Stack;
public class NextSmaller {
     public static int[] nextSmallest(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nextSmallest[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallest[i] = -1;
            } else {
                nextSmallest[i] = arr[s.peek()];
            }
            s.push(i);
        }

        return nextSmallest;
    }
    public static void main(String[] args) {
         int arr[] = { 6, 1, 18, 11, 3,1 };
        int result[] = nextSmallest(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
