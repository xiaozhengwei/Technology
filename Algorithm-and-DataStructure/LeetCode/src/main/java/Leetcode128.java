import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {
    @Test
    public void run() {

    }

    class Solution {
        public int longestConsecutive(int[] nums) {

        }
//        // hash表
//        public int longestConsecutive(int[] nums) {
//            int result = 0;
//            Set<Integer> set = new HashSet<>();
//            for (int num : nums) {
//                set.add(num);
//            }
//            for (int num : set) {
//                if (!set.contains(num - 1)) {
//                    int temp = 1;
//                    int base = num;
//                    while (set.contains(base + 1)) {
//                        temp++;
//                        base++;
//                    }
//                    result = Math.max(result, temp);
//                }
//            }
//            return result;
//        }
    }
}
