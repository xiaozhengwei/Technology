import org.junit.jupiter.api.Test;

public class Leetcode5 {

    @Test
    public void run(){
        Solution solution=new Solution();
    }


    class Solution {
        public String longestPalindrome(String s) {

            int length = s.length();

            if (length < 2) {
                return s;
            }

            int maxLength = 1;
            int begin = 0;
            char[] chars = s.toCharArray();

            boolean[][] dp = new boolean[length][length];

            for (int i = 0; i < length; i++) {
                dp[i][i] = true;
            }

            for (int L = 2; L <= length; L++) {
                for (int i = 0; i < length; i++) {
                    int j = i + L - 1;

                    if (j >= length) {
                        break;
                    }

                    if (chars[i] != chars[j]) {
                        dp[i][j] = false;
                    } else {
                        if (j - i < 3) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    }

                    if (dp[i][j] && j - i + 1 > maxLength) {
                        begin = i;
                        maxLength = j - i + 1;
                    }
                }
            }
            return s.substring(begin, begin + maxLength);
        }
    }
}
