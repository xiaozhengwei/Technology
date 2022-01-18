import org.junit.jupiter.api.Test;

public class Leetcode7 {

    @Test
    public void run() {
        Solution solution = new Solution();
        solution.reverse(1534236469);
    }

    class Solution {
        public int reverse(int x) {
            if (x == 0) {
                return 0;
            }
            //标识是正负数
            boolean flag = false;
            if (x > 0) {
                flag = true;
            }
            long result = 0;
            long temp = Math.abs(x);
            while (temp > 0) {
                if(result*10L>Integer.MAX_VALUE){
                    return 0;
                }
                result = result * 10L + temp % 10L;
                temp = temp / 10;
            }
            return (int) (flag ? result : -result);
        }
    }
}
