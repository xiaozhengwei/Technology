import org.junit.jupiter.api.Test;

public class Leetcode1446 {

    @Test
    public void run() {

    }

    class Solution {
        public int maxPower(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int maxLength = 0;
            int baseLength = 0;
            char base = s.charAt(0);
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (temp == base) {
                    baseLength++;
                }
                if (temp != base) {
                    maxLength = Math.max(baseLength, maxLength);
                    base = temp;
                    baseLength = 1;
                }
            }

            return Math.max(maxLength, baseLength);

        }
    }
}
