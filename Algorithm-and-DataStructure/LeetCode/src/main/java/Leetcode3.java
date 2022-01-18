import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {

    @Test
    public void run() {

    }

    class Solution {

        public int lengthOfLongestSubstring(String s) {
            int sLength = s.length();
            if (sLength < 1) {
                return 0;
            }
            int maxLength = 1;
            for (int i = 0; i < sLength; i++) {
                Set<Character> set = new HashSet<>();
                set.add(s.charAt(i));
                for (int j = i + 1; j < sLength; j++) {
                    if (set.contains(s.charAt(j))) {
                        int tempMaxLength = j - i;
                        maxLength = Math.max(tempMaxLength, maxLength);
                        break;
                    } else {
                        set.add(s.charAt(j));
                    }
                }
                maxLength = Math.max(maxLength, set.size());
            }
            return maxLength;
        }

    }

}
