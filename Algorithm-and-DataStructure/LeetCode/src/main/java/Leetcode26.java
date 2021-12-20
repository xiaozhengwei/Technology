import org.junit.jupiter.api.Test;

public class Leetcode26 {

    @Test
    public void run() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        solution.removeDuplicates(nums);
    }

    /**
     * 输入：nums = [1,1,2]
     * 输出：2, nums = [1,2]
     * <p>
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4]
     */
    class Solution {
        public int removeDuplicates(int[] nums) {
            int length = nums.length;
            if (length <= 1) {
                return length;
            }
            int quick = 1;
            int slow = 1;

            while (quick < length) {
                if (nums[quick] != nums[quick - 1]) {
                    nums[slow] = nums[quick];
                    slow++;
                }
                quick++;
            }
            return slow;
        }
    }
}
