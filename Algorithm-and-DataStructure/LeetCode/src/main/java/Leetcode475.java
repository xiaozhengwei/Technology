import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Leetcode475 {

    @Test
    public void run() {
        int[] houses = {1, 2, 3};
        int[] heaters = {2};
        Solution solution = new Solution();
        solution.findRadius(houses, heaters);

    }

    class Solution {
        public int findRadius(int[] houses, int[] heaters) {
            Arrays.sort(houses);
            Arrays.sort(heaters);
            int j = 0;
            int weight = Integer.MIN_VALUE;
            int result = 0;
            for (int i = 0; i < houses.length; i++) {
                while (j < heaters.length && heaters[j] < houses[i]) {
                    j++;
                }
                if (j == 0) {
                    weight = heaters[j] - houses[i];
                } else if (j == heaters.length) {
                    weight = houses[i] - heaters[j - 1];
                } else {
                    weight = Math.min(heaters[j] - houses[i], houses[i] - heaters[j - 1]);
                }
                result = Math.max(weight, result);
            }
            return result;
        }

    }
}
