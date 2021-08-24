public class Leetcode787 {

    class Solution {
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            int[][] dp = new int[k + 2][n];
            int maxPrice = 10000 * 101 + 1;
            for (int i = 0; i < k + 2; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = maxPrice;
                }
            }
            dp[0][src] = 0;

            for (int i = 1; i < k + 2; i++) {
                for (int[] flight : flights) {
                    int start = flight[0];
                    int end = flight[1];
                    int price = flight[2];
                    dp[i][end] = Math.min(dp[i][end], dp[i - 1][start] + price);
                }
            }
            int ans = Integer.MAX_VALUE;
            for (int i = 1; i < k + 2; i++) {
                ans = Math.min(ans, dp[i][dst]);
            }

            return ans == maxPrice ? -1 : ans;
        }

    }

}
