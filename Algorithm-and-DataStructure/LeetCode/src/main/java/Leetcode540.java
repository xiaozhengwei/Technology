import org.junit.jupiter.api.Test;

public class Leetcode540 {

    @Test
    public void run() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        int result = solution.singleNonDuplicate(nums);
        System.out.println(result);
    }

    class Solution {
        public int singleNonDuplicate(int[] nums) {
            if (nums.length <= 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result=result^nums[i];
            }
            return result;
        }
    }
}
