import org.junit.jupiter.api.Test;

public class Leetcode5 {

    @Test
    public void run(){

    }

    static class Solution {
        public String longestPalindrome(String s) {
            if (s.length()<2){
                return s;
            }
            int[][] dp = new int[s.length()][s.length()];
            char[] chars = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                dp[i][i] = 1;
            }
            int maxLength = 1;
            int start = 0;
            for (int L = 2; L <= s.length(); L++) {
                for (int i = 0; i < s.length(); i++) {
                    int j = L + i - 1;
                    if (j >= s.length()) {
                        break;
                    }

                    if (chars[j] != chars[i]) {
                        dp[i][j] = 0;
                    } else {
                        if (j - i < 3) {
                            dp[i][j] = 1;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    }

                    if (dp[i][j] == 1 && (j - i + 1) > maxLength) {
                        start = i;
                        maxLength = L;
                    }
                }

            }
            return s.substring(start,start+maxLength);
        }
    }
}
