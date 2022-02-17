import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Leetcode53 {

    @Test
    public void run() {
        System.out.println(Integer.MIN_VALUE);
    }

    class Solution {
        public int maxSubArray(int[] nums) {
            // 记录从下标i到下标j的最大和
            int [][]dp=new int[nums.length][nums.length];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                dp[i][i]=nums[i];
            }

            return dp[0][nums.length-1];
        }
    }
}
