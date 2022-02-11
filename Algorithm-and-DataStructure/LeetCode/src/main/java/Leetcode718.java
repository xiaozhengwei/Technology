import org.junit.jupiter.api.Test;

public class Leetcode718 {

    @Test
    public void run(){
        Solution solution=new Solution();
        int []nums1={1,2,3,2,1};
        int []nums2={3,2,1,4,7};
        solution.findLength(nums1,nums2);
    }

    class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            int length1 = nums1.length;
            int length2 = nums2.length;
            int[][] dp = new int[length1 + 1][length2 + 1];
            int res = 0;
            for (int i = 1; i <= length1; i++) {
                for (int j = 1; j <= length2; j++) {
                    if (nums1[i-1] == nums2[j-1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    res = Math.max(res, dp[i][j]);
                }
            }
            return res;
        }
    }
}
