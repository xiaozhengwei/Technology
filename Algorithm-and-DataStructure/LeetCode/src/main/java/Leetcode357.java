import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.LockSupport;

public class Leetcode357 {

    @Test
    public void run() {
        Solution solution = new Solution();
        solution.countNumbersWithUniqueDigits(1);
    }

    class Solution {
        public int countNumbersWithUniqueDigits(int n) {
            if (n == 0) {
                return 1;
            }
            ;
            if (n == 1) {
                return 10;
            }
            int res = 10, cur = 9;
            for (int i = 0; i < n - 1; i++) {
                cur *= 9 - i;
                res += cur;
            }
            return res;
        }
    }
}
