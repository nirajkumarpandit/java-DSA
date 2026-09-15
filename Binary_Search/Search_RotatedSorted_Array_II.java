package Binary_Search;

public class Search_RotatedSorted_Array_II {
    static boolean search(int[] nums, int target) {
        int low=0; int high =nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            //if mid are the target
            if(nums[mid]==target) return true;
            // handle duplicate value
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            //if array is already sorted so apply simple binary search
            if(nums[low]<nums[high]){
                while(low<=high){
                    mid=(low+high)/2;
                    if(nums[mid]==target) return true;
                    else if(nums[mid]<target) low=mid+1;
                    else high =mid-1;
                }
            }
            // if left part are  sorted 
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target <=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            //if right part sorted ho
            else{
                if(nums[mid]<=target && target <= nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={2,5,6,0,0,1,2}; int target=0;
        System.out.println(search(nums, target));
    }
}
