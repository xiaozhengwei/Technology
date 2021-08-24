import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Leetcode345 {

    @Test
    public void run() {
        Solution solution = new Solution();
        solution.reverseVowels("asd");
    }

    class Solution {

        public boolean isVowel(char ch) {
            return "aeiouAEIOU".indexOf(ch) >= 0;
        }

        public String reverseVowels(String s) {

            char[] array = s.toCharArray();
            int length = array.length;
            int start = 0;
            int end = length - 1;
            while (start < end) {
                while (start < length && !isVowel(array[start])) {
                    start++;
                }

                while (0 < end && !isVowel(array[end])) {
                    end--;
                }
                if (start < end) {
                    swap(array, start, end);
                    start++;
                    end--;
                }
            }
            return new String(array);

        }

        private void swap(char[] array, int i, int j) {
            if (i != j) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
    }
}
