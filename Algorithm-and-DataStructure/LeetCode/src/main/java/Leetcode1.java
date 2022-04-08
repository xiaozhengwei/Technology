import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * 两数之和
 */
public class Leetcode1 {

    @Test
    public void run() {
        Solution solution=new Solution();
        int nums[]={1,1,1,1,1,3,3};
        int target=6;
        solution.twoSum(nums,target);
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] result = {-1, -1};
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                if (map.get(target - temp) != null) {
                    {
                        return new int[]{map.get(target - temp), i};
                    }
                } else {
                    map.put(nums[i], i);
                }
            }
            return result;
        }
    }
}
