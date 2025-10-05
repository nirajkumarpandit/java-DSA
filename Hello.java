import java.util.Stack;

public class Hello {
    public static void main(String[] args) {
        int arr[] = {11,81,94,43,3};
         int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i];
            for (int j = i; j < arr.length; j++) {
               min=Math.min(min, arr[j]);
               sum=sum+min;
            }
        }
       
        
        System.out.println(sum);
    }
}
