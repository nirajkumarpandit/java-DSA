package Binary_Search;

public class SingleElement {
     static  int singleNonDuplicate(int[] nums) {
        // approach --> agar even index hai to right me usaka duplicate hoga
        // agar odd huaa to left me uska duplicate ho yesa nahi hai to wahi single element hai
        //edge case
        // if 1 element present in array
        if(nums.length==1) return nums[0];
        //firt element 
        if(nums[0]!=nums[1]) return nums[0];
        //last element 
        if(nums[nums.length-1] !=nums[nums.length-2]) return nums[nums.length-1];
        int low=1; int high=nums.length-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] !=nums[mid+1] && nums[mid] !=nums[mid-1]) return nums[mid];
            if(mid%2==1 && nums[mid]== nums[mid-1] 
            || mid%2==0 && nums[mid]==nums[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
