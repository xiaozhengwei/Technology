import org.junit.jupiter.api.Test;

public class Leetcode704 {

    @Test
    public void run() {
        int []nums={-1,0,3,5,9,12};
        Solution solution=new Solution();
        solution.search(nums,9);
    }


    class Solution {
        public int search(int[] nums, int target) {
            int length = nums.length;
            int low = 0;
            int high = length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int num = nums[mid];
                if (num == target) {
                    return mid;
                } else if (num > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }
}
