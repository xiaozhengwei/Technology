import org.junit.jupiter.api.Test;

public class Leetcode91 {

    @Test
    public void run() {
        Solution solution=new Solution();
        String s="12";
        solution.numDecodings(s);
    }

    class Solution {
        public int numDecodings(String s) {
            int length = s.length();
            int[] dp = new int[length + 1];
            dp[0] = 1;
            char[] chars = s.toCharArray();
            for (int i = 1; i <= length; i++) {
                if (chars[i - 1] != '0') {
                    dp[i] += dp[i - 1];
                }
                if (i > 1 && chars[i - 2] != '0' && (((chars[i - 2] - '0') * 10 + chars[i - 1]-'0') <= 26)) {
                    dp[i] += dp[i - 2];
                }
            }
            return dp[length];
        }
    }
}
