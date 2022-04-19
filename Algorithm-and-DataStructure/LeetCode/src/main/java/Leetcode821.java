import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Leetcode821 {

    @Test
    public void run() {
        Solution solution = new Solution();
        int[] results = solution.shortestToChar("loveleetcode", 'e');
        System.out.println(Arrays.toString(results));
    }


    class Solution {

        // 两次遍历
        public int[] shortestToChar(String s, char c) {
            char[] chars = s.toCharArray();
            int length = s.length();
            int[] results = new int[length];
            for (int i = 0, left = -length; i < length; i++) {
                if (chars[i] == c) {
                    left = i;
                }
                results[i] = i - left;
            }
            for (int i = length - 1, right = 2 * length; i >= 0; i--) {
                if (chars[i] == c) {
                    right = i;
                }
                results[i] = Math.min(results[i], right - i);
            }
            return results;
        }

//        //暴力破解
//        public int[] shortestToChar(String s, char c) {
//            char[] chars = s.toCharArray();
//            int[] results = new int[s.length()];
//            for (int i = 0; i < s.length(); i++) {
//                int left = i;
//                int right = i;
//                while (left >= 0 && chars[left] != c) {
//                    left--;
//                }
//                while (right < s.length() && chars[right] != c) {
//                    right++;
//                }
//                if (left == -1) {
//                    results[i] = Math.abs(right - i);
//                } else if (right == s.length()) {
//                    results[i] = Math.abs(left - i);
//                } else {
//                    results[i] = Math.min(Math.abs(right - i), Math.abs(left - i));
//                }
//            }
//            return results;
//        }
    }
}
