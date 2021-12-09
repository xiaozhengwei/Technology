import org.junit.jupiter.api.Test;

public class Leetcode1034 {

    @Test
    public void run() {

    }

    class Solution {
        int[][] directions = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        public int[][] colorBorder(int[][] grid, int row, int col, int color) {
            int n = grid.length;
            int m = grid[0].length;
            boolean[][] visited = new boolean[n][m];
            int originalColor = grid[row][col];
            dyeing(grid,visited, originalColor, color, row, col);
            return grid;
        }

        public void dyeing(int[][] grid, boolean[][] visited, int originalColor, int color, int row, int col) {
            // 如果下标越界 或者 与初始点的值不相同 或者 该点被访问过 都不能成为边界
            if (!isCrossTheBorder(grid, row, col) || grid[row][col] != originalColor || visited[row][col]) {
                return;
            }
            visited[row][col] = true;
            boolean border =isBorder(grid,row,col,originalColor) ;
            // 之前已经判断过condition下标没有越界
            // 其次，如果是grid的边界，那么一定是连分量的边界
            // 最后，如果该点的任意一个方向不为初始点的值，那么该点肯定是位于边界上的，因为如果不是边界，四面的值都应该是val
            // dfs四个方向
            for (int[] direction : directions) {
                int changeX = direction[0] + row;
                int changeY = direction[1] + col;
                dyeing(grid,visited, originalColor, color, changeX, changeY);
            }
            if (border) {
                grid[row][col] = color;
            }
        }

        public boolean isCrossTheBorder(int[][] grid, int i, int j) {
            return i >= 0 && j >= 0 && i < grid.length && j < grid[0].length;
        }

        public boolean isBorder(int [][]grid,int row,int col,int originalColor){
            return row == 0 || col == 0 || row == grid.length - 1 || col == grid[0].length - 1 || grid[row + 1][col] != originalColor || grid[row][col+ 1] != originalColor || grid[row - 1][col] != originalColor || grid[row][col - 1] != originalColor;
        }
    }

}
