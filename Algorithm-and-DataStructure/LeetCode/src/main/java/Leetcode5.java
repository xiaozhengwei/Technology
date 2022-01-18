import org.junit.jupiter.api.Test;

import java.nio.MappedByteBuffer;

public class Leetcode5 {

    @Test
    public void run() {

    }

    class Solution {
        public String longestPalindrome(String s) {
            int length = s.length();
            if (length <= 1) {
                return s;
            }
            int start = 0;
            int maxLength = 1;
            // 判断从i下标到j下标是否是回文串
            int[][] dp = new int[length][length];
            // 所有的
            for (int i = 0; i < length; i++) {
                dp[i][i] = 1;
            }
            // L表示字符串的长度
            for (int L = 2; L <= length; L++) {
                for (int i = 0; i < length; i++) {
                    int j = i + L - 1;
                    if (j >= length) {
                        continue;
                    }
                    if (s.charAt(i) == s.charAt(j)) {
                        if (L < 3) {
                            dp[i][j] = 1;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    } else {
                        dp[i][j] = 0;
                    }
                    if (dp[i][j] == 1 && maxLength < L) {
                        start = i;
                        maxLength = L;
                    }
                }
            }
            return s.substring(start, start + maxLength);
        }


//        public String longestPalindrome(String s) {
//            int length = s.length();
//            // 创建一个二维数组,表示从i到j坐标是不是回文串;
//            int[][] dp = new int[length][length];
//            char []chars=s.toCharArray();
//            // 单个字符都是回文串,先把他们变成1
//            for (int i = 0; i < length; i++) {
//                dp[i][i] = 1;
//            }
//            // 表示目前最长的回文串长度
//            int maxLength = 1;
//            // 表示从哪里开始,是最长回文子串的起点
//            int start = 0;
//            // L表示字符串长度,长度从2开始 [当前]
//            for (int L = 2; L <= length; L++) {
//                //表示回文串开始的下标
//                for (int i = 0; i < length; i++) {
//                    //表示从i开始,长度为L的字串下标
//                    int j = i + L - 1;
//                    // 下标j越界了,那么结束本次循环
//                    if (j >= length) {
//                        break;
//                    }
//                    // 比较开始和结束是否相同,如果不相同,肯定不是回文字串
//                    if (chars[i] != chars[j]) {
//                        dp[i][j] = 0;
//                    } else {
//                        // 如果当前长度小于3 ,i,j位置的字符相同,肯定是回文串
//                        // 例如 : aba  aa
//                        if (L <= 3) {
//                            dp[i][j] = 1;
//                        } else {
//                            // 对于长度超过3的,那么就看长度-2,去除i,j这两个坐标的字串是不是回文了
//                            // 例如:abcba abcda  就看 bcb ,bcd 是不是回文串了 dp[0][4]=dp[1][3];
//                            dp[i][j] = dp[i + 1][j - 1];
//                        }
//                    }
//                    // 如果i到j是回文串,而且当前最长的回文字符串长度小于,当前回文串的长度,那么记录长度和起始下标
//                    if (dp[i][j] == 1 && maxLength < L) {
//                        start = i;
//                        maxLength = L;
//                    }
//                }
//            }
//            // 通过起始下标和最大长度截取最长回文子串
//            return s.substring(start, start + maxLength);
//        }
    }
}
