import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {

    @Test
    public void run() {

    }

    class Solution {

        List<String> results = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            // 记录左括号个数
            int left = 0;
            // 记录右括号个数
            int right = 0;
            assemble(new StringBuffer(), left, right, n);
            return results;
        }

        public void assemble(StringBuffer subString, int left, int right, int total) {
            if (subString.length() == 2 * total) {
                results.add(subString.toString());
                return;
            }

            if (left < total) {
                subString.append('(');
                assemble(subString, left + 1, right, total);
                subString.deleteCharAt(subString.length() - 1);
            }

            if (right < left) {
                subString.append(')');
                assemble(subString, left, right + 1, total);
                subString.deleteCharAt(subString.length() - 1);
            }
        }

    }
}
