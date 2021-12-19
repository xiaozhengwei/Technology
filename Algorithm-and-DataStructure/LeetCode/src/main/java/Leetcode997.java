public class Leetcode997 {


    class Solution {
        public int findJudge(int n, int[][] trust) {
            int[] in = new int[n];
            int[] out = new int[n];

            for (int[] nums : trust) {
                ++in[nums[0]-1];
                ++out[nums[1]-1];
            }

            for (int i = 0; i < n; i++) {
                if (out[i] == n - 1 && in[i] == 0) {
                    return i+1;
                }
            }
            return -1;
        }
    }

}
