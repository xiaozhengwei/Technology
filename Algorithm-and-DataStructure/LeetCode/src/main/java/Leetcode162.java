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
            int start = 0,
                    end = nums.length - 1;
            while (start < end) {
                int mid = (start + end) / 2;
                if (nums[mid] < nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return start;
        }
    }
}
