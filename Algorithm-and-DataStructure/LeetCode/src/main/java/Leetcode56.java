import org.junit.jupiter.api.Test;

import java.util.*;

public class Leetcode56 {

    @Test
    public void run() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Solution solution = new Solution();
        solution.merge(intervals);
    }

    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) {
                return intervals;
            }
            Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
            List<int[]> results = new ArrayList<>();
            int[] base = intervals[0];
            for (int i = 1; i < intervals.length; i++) {
                int[] current = intervals[i];
                if (current[0] > base[1]) {
                    int[] result = Arrays.copyOf(base, base.length);
                    results.add(result);
                    base = current;
                } else {
                    base[1] = Math.max(base[1], current[1]);
                }
                if (i == intervals.length - 1) {
                    results.add(base);
                }
            }
            return results.toArray(new int[results.size()][]);
        }
    }
}
