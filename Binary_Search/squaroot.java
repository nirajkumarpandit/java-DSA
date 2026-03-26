package Binary_Search;
// using the binary search 
public class squaroot {
    public static void main(String[] args) {
        int n=36;
        int low=1; int high=n;
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid*mid)<=n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.print("the square root of "+n+ " is "+ans);
    }
}
