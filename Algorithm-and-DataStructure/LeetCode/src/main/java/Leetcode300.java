import org.junit.jupiter.api.Test;

public class Leetcode300 {

    @Test
    public void run() {

    }

    class Solution {
        public int lengthOfLIS(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            // 到该下标的最长递增子序列
            int dp[] = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    dp[i] = 1;
                } else {
                    if (nums[i] >= nums[i - 1]) {
                        dp[i] = dp[i - 1] + 1;
                    } else {
                        dp[i] = 1;
                    }
                }
            }
            int result = 1;
            for (int num : dp) {
                result = Math.max(result, num);
            }
            return result;
        }
    }

}
