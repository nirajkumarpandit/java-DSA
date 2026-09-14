package Binary_Search;

class Search_RotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 6, 1, 2 };
        int target = 3;
        // we divide into three parts
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // 1 part
            // if array already sorted so apply simple binary search
            if (nums[low] < nums[high]) {
                while (low < high) {
                    mid = (low + high) / 2;
                    if (nums[mid] == target) {
                        System.out.println(mid);
                        break;
                    } else if (nums[mid] < target) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
            // agar mid hi target ho
            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            }
            // 2 part
            // yesa nahi hai to left part sorted ho
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // agar yesa nahi hai to right part sorted hoga
            else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }

}