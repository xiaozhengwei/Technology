import org.junit.jupiter.api.Test;

public class Leetcode787 {

    @Test
    public void run() {

    }

    class Solution {

        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            int[][] dp = new int[k + 2][n];
            int minPrice = Integer.MAX_VALUE;
            int maxPrice = 10000 * 101 + 1;

            for (int i = 0; i < k + 2; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = maxPrice;
                }
            }
            dp[0][src] = 0;
            for (int step = 1; step <= k + 1; step++) {
                for (int[] flight : flights) {
                    int start = flight[0];
                    int end = flight[1];
                    int price = flight[2];
                    dp[step][end] = Math.min(dp[step][end], dp[step - 1][start] + price);
                }
            }
            for (int step = 1; step <= k + 1; step++) {
                minPrice = Math.min(dp[step][dst], minPrice);
            }
            return minPrice == maxPrice ? -1 : minPrice;
        }
    }

}
