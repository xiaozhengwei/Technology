import org.junit.jupiter.api.Test;

public class Leetcode8 {

    @Test
    public void run() {
        Solution solution = new Solution();
        String num = "  -42";
        int a = solution.myAtoi(num);
        System.out.println(a);
    }

    class Solution {
        public int myAtoi(String str) {
            str = str.trim();
            if (str.length() == 0) return 0;
            if (!Character.isDigit(str.charAt(0))
                    && str.charAt(0) != '-' && str.charAt(0) != '+')
                return 0;
            long ans = 0L;
            boolean neg = str.charAt(0) == '-';
            int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                ans = ans * 10 + (str.charAt(i++) - '0');
                if (!neg && ans > Integer.MAX_VALUE) {
                    ans = Integer.MAX_VALUE;
                    break;
                }
                if (neg && ans > 1L + Integer.MAX_VALUE) {
                    ans = 1L + Integer.MAX_VALUE;
                    break;
                }
            }
            return neg ? (int) -ans : (int) ans;
        }
    }

}
