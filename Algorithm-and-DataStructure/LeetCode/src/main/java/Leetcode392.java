import org.junit.jupiter.api.Test;

public class Leetcode392 {

    @Test
    public void run() {

    }

    class Solution {
        public boolean isSubsequence(String s, String t) {
            int sLength = s.length();
            int tLength = t.length();
            int sIndex = 0;
            int tIndex = 0;
            while (sIndex < sLength && tIndex < tLength) {
                if (s.charAt(sIndex) == t.charAt(tIndex)) {
                    sIndex++;
                    tIndex++;
                } else {
                    tIndex++;
                }
            }
            return sIndex==sLength;
        }
    }
}
