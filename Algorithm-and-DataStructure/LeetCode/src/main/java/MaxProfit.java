import org.junit.jupiter.api.Test;

public class MaxProfit {

    @Test
    public void run() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        solution.maxProfit(nums);
    }

    class Solution {

        // 使用贪心算法
        //public int maxProfit(int[] prices) {
        //    if (prices == null || prices.length < 2)
        //        return 0;
        //    int total = 0, index = 0, length = prices.length;
        //    while (index < length) {
        //        //如果股票下跌就一直找，直到找到股票开始上涨为止
        //        while (index < length - 1 && prices[index] >= prices[index + 1])
        //            index++;
        //        //股票上涨开始的值，也就是这段时间上涨的最小值
        //        int min = prices[index];
        //        //一直找到股票上涨的最大值为止
        //        while (index < length - 1 && prices[index] <= prices[index + 1])
        //            index++;
        //        //计算这段上涨时间的差值，然后累加
        //        total += prices[index++] - min;
        //    }
        //    return total;
        //}

        // 使用动态规划
        //public int maxProfit(int[] prices) {
        //    int length = prices.length;
        //    if (prices.length < 2)
        //        return 0;

        //    int[][] dp = new int[length + 1][2];
        //    dp[1][0] = 0;
        //    dp[1][1] = -prices[0];
        //    for (int i = 2; i <= length; i++) {
        //        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i - 1]);
        //        dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i - 1]);
        //    }
        //    return dp[length][0];
        //}

        // 动态规划优化

        public int maxProfit(int[] prices) {
            int length = prices.length;
            if (prices.length < 2)
                return 0;

            int noHave = 0;
            int have = -prices[0];

            for (int i = 1; i < length; i++) {
                noHave=Math.max(have,have+prices[i]);
                have=Math.max(noHave,noHave-prices[i]);
            }
            return noHave;
        }
    }

}
