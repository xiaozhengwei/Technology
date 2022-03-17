import org.junit.jupiter.api.Test;

public class Leetcode64 {
    @Test
    public void run() {
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        Solution solution=new Solution();
        solution.minPathSum(grid);
    }

    class Solution {
        public int minPathSum(int[][] grid) {
            if (grid.length == 0) {
                return 0;
            }
            int row = grid.length - 1;
            int col = grid[0].length - 1;
            //表示从(0,0)到(row,col)的最小和
            int[][] dp = new int[row+1][col+1];

            for (int i = 0; i <= row; i++) {
                for (int j = 0; j <= col; j++) {
                    if (i == 0 && j == 0) {
                        dp[i][j] = grid[0][0];
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j - 1] + grid[i][j];
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + grid[i][j];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j] + grid[i][j], dp[i][j - 1] + grid[i][j]);
                    }
                }
            }
            return dp[row][col];
        }
    }
}
