import org.junit.jupiter.api.Test;

public class Leetcode1816 {

    @Test
    public void run() {
        Solution solution = new Solution();
        String result = solution.truncateSentence("Hello how are you Contestant", 4);
        System.out.println(result);
    }

    class Solution {
        public String truncateSentence(String s, int k) {
            int length = s.length();
            int isChanged = 0;
            int end = 0;
            for (int index = 0; index < length; index++) {
                char c = s.charAt(index);

                if (c == ' ') {
                    isChanged++;
                    if (isChanged == k) {
                        break;
                    }
                }
                end++;
            }
            return s.substring(0, end);
        }
    }
}
