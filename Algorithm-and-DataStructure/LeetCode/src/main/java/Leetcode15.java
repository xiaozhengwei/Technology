import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {

    @Test
    public void run() {

    }

    class Solution {

        public List<List<Integer>> threeSum(int[] nums) {
            if (nums.length < 3) {
                return new ArrayList<>();
            }
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            int length = nums.length;
            for (int first = 0; first < length; first++) {
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                int third = length - 1;
                int target = -nums[first];
                for (int second = first + 1; second < nums.length; second++) {
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    while (second < third && target < nums[second] + nums[third]) {
                        third--;
                    }
                    if (third == second) {
                        break;
                    }
                    if (nums[first] + nums[second] + nums[third] == 0) {
                        List<Integer> one = new ArrayList<>();
                        one.add(nums[first]);
                        one.add(nums[second]);
                        one.add(nums[third]);
                        result.add(one);
                    }
                }
            }
            return result;
        }

    }
}
