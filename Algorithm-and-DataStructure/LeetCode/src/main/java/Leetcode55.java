import org.junit.jupiter.api.Test;

public class Leetcode55 {

    @Test
    public void run() {

    }

    class Solution {

        // 从后向前判断
        public boolean canJump(int[] nums) {
            int last = nums.length - 1;
            int n = last;
            for (int i = n - 1; i >= 0; i++) {
                if (nums[i] + i > last) {
                    last = i;
                }
            }
            return last==0;
        }

//        // 贪心算法
//        public boolean canJump(int[] nums) {
//            int max = 0;
//            for (int i = 0; i < nums.length - 1; i++) {
//                if (max < i) {
//                    return false;
//                }
//                max = Math.max(i + nums[i], max);
//            }
//            return true;
//        }
    }
}
