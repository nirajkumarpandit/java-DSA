package Stack;
import java.util.Stack;
public class MaxAreaHistogram{
    public static int maxAreaHistogram(int arr[]){
        int n=arr.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        // step 1--> next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // step 2--> next smaller left
         s=new Stack<>(); // stack empty
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()] >=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // step 3--> current area
        int maxArea=0;
        for(int i=0;i<arr.length; i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height * width;
            maxArea=Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(maxAreaHistogram(arr));
    }
}