import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
/**
 *
 * 全排列
 *
 * 给定一个不含重复数字的数组 nums,返回其 所有可能的全排列,你可以按任意顺序返回答案
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * 示例 2：
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 *
 * 示例 3：
 * 输入：nums = [1]
 * 输出：[[1]]
 */
public class Leetcode46 {

    @Test
    public void run() {

    }

    static class Solution {

        public List<List<Integer>> permute(int[] nums) {
            int len = nums.length;
            List<List<Integer>> results = new ArrayList<>();
            if (len == 0) {
                return results;
            }
            Deque<Integer> path = new ArrayDeque<>();
            boolean[] used = new boolean[len];
            dfs(nums, len, 0, path, used, results);
            return results;
        }

        public void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> results) {
            if (depth == len) {
                results.add(new ArrayList<>(path));
                return;
            }
            for(int i=0;i<len;i++){
                if(used[i]){
                    continue;
                }
                path.addLast(nums[i]);
                used[i]=true;
                dfs(nums,len,depth+1,path,used,results);
                path.removeLast();
                used[i]=false;
            }

        }
    }
}
