import org.junit.jupiter.api.Test;

public class Leetcode747 {

    @Test
    public void run() {
        Solution solution = new Solution();
        //int[] nums = {1, 2, 3, 4};
        //int[] nums = {3, 6, 1, 0};
        int[] nums = {0, 0, 3, 2};
        solution.dominantIndex(nums);
    }


    class Solution {
        public int dominantIndex(int[] nums) {
            int max = 0;
            int maxL = 0;
            int maxIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    maxIndex = i;
                    continue;
                }
                if (nums[i] > maxL) {
                    maxL = nums[i];
                }
            }
            return max >= maxL * 2 ? maxIndex : -1;
        }
    }
}
