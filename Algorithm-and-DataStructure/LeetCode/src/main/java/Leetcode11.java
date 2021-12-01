import org.junit.jupiter.api.Test;

public class Leetcode11 {
    @Test
    public void run() {

    }

    static class Solution {

        public int maxArea(int[] height) {

            int length = height.length - 1;
            int maxArea = 0;

            for (int lengthIndex = 1; lengthIndex < length; lengthIndex++) {

                for (int i = 0; i < height.length; i++) {

                    int j = i + lengthIndex; 

                    if (j >= height.length) {
                        break;
                    }

                    if (Math.min(height[i], height[j]) * lengthIndex > maxArea) {
                        maxArea = Math.min(height[i], height[j]);
                    }
                }
            }

            return maxArea;

        }

    }
}
