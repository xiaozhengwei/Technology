import org.junit.jupiter.api.Test;

public class Leetcode11 {
    @Test
    public void run() {

    }

class Solution {

    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start < end) {
            int weight = end - start;
            int tempArea = weight * Math.min(height[start], height[end]);
            maxArea = Math.max(tempArea, maxArea);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }

        return maxArea;
    }

}

}
