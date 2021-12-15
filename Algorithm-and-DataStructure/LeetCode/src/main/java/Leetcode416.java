import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Leetcode416 {

    @Test
    public void run() {
        System.out.println(true|true);
        System.out.println(false|true);
        System.out.println(false|false);
    }

    static class Solution {

        public boolean canPartition(int[] nums) {
            int sum = 0;
            int maxSum=0;
            int length=nums.length;
            for (int num : nums) {
                sum += num;
                maxSum=Math.min(sum,maxSum);
            }
            int target=sum/2;
            if(sum%2==1||maxSum>target||length<=1){
                return false;
            }
            boolean [][]dp=new boolean[length][target+1];
            for(int i=0;i<length;i++){
                dp[i][0]=true;
            }

            dp[0][nums[0]]=true;

            for(int i=1;i<length;i++){
                int num=nums[i];
                for(int j=1;j<=target;j++){
                    if(j>=num){
                        dp[i][j]=dp[i-1][j]|dp[i-1][j-num];
                    }else {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }

            return dp[length - 1][target];
        }
    }

}
