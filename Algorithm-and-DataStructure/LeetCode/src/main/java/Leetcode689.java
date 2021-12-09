import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Leetcode689 {

    @Test
    public void run() {

    }

    class Solution {
        Map<String, Integer> dp = new HashMap<>();

        public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
            int[] result = {0, k, 2 * k};
            int total = 0;
            for (int aIndex = 0; aIndex <= nums.length - 3 * k; aIndex++) {
                for (int bIndex = aIndex + k; bIndex <= nums.length - 2 * k; bIndex++) {
                    for (int cIndex = bIndex + k; cIndex <= nums.length - k; cIndex++) {
                        int tempTotal = threeTotal(nums, aIndex, bIndex, cIndex, k);
                        if (tempTotal > total) {
                            result = new int[]{aIndex, bIndex, cIndex};
                            total = tempTotal;
                        }
                    }
                }
            }
            return result;
        }

        public int threeTotal(int[] nums, int aIndex, int bIndex, int cIndex, int k) {
            String key = aIndex + "" + bIndex + "" + cIndex;
            if (dp.get(key) != null) {
                return dp.get(key);
            }
            int aTotal = total(nums, aIndex, k);
            int bTotal = total(nums, bIndex, k);
            int cTotal = total(nums, cIndex, k);
            int abcTotal = aTotal + bTotal + cTotal;
            dp.put(key, abcTotal);
            return abcTotal;
        }

        public int total(int[] nums, int index, int k) {
            int total = 0;
            for (int i = 0; i < k; i++) {
                total += nums[index + i];
            }
            return total;
        }
    }
}
