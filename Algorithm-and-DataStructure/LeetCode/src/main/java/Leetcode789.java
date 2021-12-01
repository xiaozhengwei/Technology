import org.junit.jupiter.api.Test;

public class Leetcode789 {

    @Test
    public void run() {

    }

    class Solution {
        public boolean escapeGhosts(int[][] ghosts, int[] target) {
            int myLength = Math.abs(target[0] - 0) + Math.abs(target[1] - 0);
            for (int[] ghost : ghosts) {
                int tempLength = Math.abs(target[0] - ghost[0]) + Math.abs(target[1] - ghost[1]);
                if (tempLength < myLength) {
                    return false;
                }
            }
            return true;
        }
    }

}
