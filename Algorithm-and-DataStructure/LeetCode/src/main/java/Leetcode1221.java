import org.junit.jupiter.api.Test;

public class Leetcode1221 {
    @Test
    public void run() {

    }

    static class Solution {
        public int balancedStringSplit(String s) {
            char[] arr = s.toCharArray();
            int length = arr.length;
            int d = 0;
            int ans = 0;
            for (char ch : arr) {
                if (ch == 'L') {
                    d++;
                } else {
                    d--;
                }
                if (d == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }

}
