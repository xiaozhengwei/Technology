import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode39 {

    @Test
    public void demo() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 5};
        List<List<Integer>> result = solution.combinationSum(nums, 8);
        System.out.println(result);
    }

    class Solution {

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            findResult(candidates, target, 0, result, new ArrayList<>());
            return result;
        }

        public void findResult(int[] candidates, int target, int start, List<List<Integer>> result, List<Integer> current) {
            if (start == candidates.length) {
                return;
            }
            if (target == 0) {
                result.add(new ArrayList<>(current));
                return;
            }
            findResult(candidates, target, start + 1, result, current);
            if (target >= candidates[start]) {
                current.add(candidates[start]);
                findResult(candidates, target - candidates[start], start, result, current);
                current.remove(current.size() - 1);
            }
        }

    }

}
