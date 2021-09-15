public class Leetcode162 {

    class Solution {
//        public int findPeakElement(int[] nums) {
//            int MAX = Integer.MIN_VALUE;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] > MAX) {
//                    MAX = nums[i];
//                    if (i + 1 < nums.length && MAX >= nums[i + 1]) {
//                        return i;
//                    }
//                }
//            }
//            return nums.length-1;
//        }

        public int findPeakElement(int[] nums) {
            int l = 0, r = nums.length - 1;
            while (l < r) {
                int m = (l + r) / 2;
                if (nums[m] < nums[m + 1]) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
            return l;
        }
    }
}
