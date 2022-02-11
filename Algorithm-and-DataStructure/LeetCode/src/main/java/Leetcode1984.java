import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Leetcode1984 {
    @Test
    public void run(){
        int []nums={87063,61094,44530,21297,95857,93551,9918};
        Solution solution=new Solution();
        solution.minimumDifference(nums,6);
    }

    class Solution {
        public int minimumDifference(int[] nums, int k) {
            if(k==1&&nums.length<=1){
                return 0;
            }
            Arrays.sort(nums);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<=nums.length-k;i++){
                int minIndex=i;
                int maxIndex=i+k-1;
                int temp=Math.abs(nums[minIndex]-nums[maxIndex]);
                if(temp<min) {
                    min = temp;
                }
            }
            return min;
        }
    }

}
