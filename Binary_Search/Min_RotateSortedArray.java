package Binary_Search;

public class Min_RotateSortedArray {
    static int findMin(int[] nums) {
        int low=0; int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[high]) return nums[low];
            // check which part we remove 
            //agar mid big hai to conform min right part me hai
            if(nums[mid]> nums[high]){
                low=mid+1;
            }else{ // nahi to left part me hoga
                high=mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int nums[]={3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
