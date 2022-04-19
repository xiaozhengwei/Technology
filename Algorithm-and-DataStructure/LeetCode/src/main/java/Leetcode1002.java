import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1002 {

    class Solution {
        public List<String> commonChars(String[] words) {
            int[] minFreq = new int[26];
            Arrays.fill(minFreq, Integer.MAX_VALUE);
            List<String> results = new ArrayList<>();
            for (String word : words) {
                int[] letters = new int[26];
                char[] chars = word.toCharArray();
                for (char c : chars) {
                    letters[c - 'a'] += 1;
                }
                for (int i = 0; i < 26; i++) {
                    minFreq[i] = Math.min(minFreq[i], letters[i]);
                }
            }
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < minFreq[i]; j++) {
                    results.add(String.valueOf((char) ('a' + i)));
                }
            }
            return results;
        }
    }

}
