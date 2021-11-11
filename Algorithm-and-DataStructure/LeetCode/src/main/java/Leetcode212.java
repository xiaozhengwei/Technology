import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode212 {

    @Test
    public void run() {


    }

    static class Solution {

        public List<String> findWords(char[][] board, String[] words) {
            List<String> answers = new ArrayList<>();
            for (String word : words) {
                if (hasPath(board, word.toCharArray())) {
                    answers.add(word);
                }
            }

            return answers;
        }


        private boolean hasPath(char[][] matrix, boolean[][] visited, int row, int col, int pathLength, char[] str) {

            boolean hasPath = false;
            if (str.length <= pathLength)
                return true;

            if (row >= 0 && row < matrix.length &&
                    col >= 0 && col < matrix[0].length &&
                    matrix[row][col] == str[pathLength]
                    && !visited[row][col]
            ) {

                ++pathLength;
                visited[row][col] = true;
                hasPath = hasPath(matrix, visited, row + 1, col, pathLength, str) ||
                        hasPath(matrix, visited, row - 1, col, pathLength, str) ||
                        hasPath(matrix, visited, row, col + 1, pathLength, str) ||
                        hasPath(matrix, visited, row, col - 1, pathLength, str);

                if (!hasPath) {
                    --pathLength;
                    visited[row][col] = false;
                }

            }
            return hasPath;
        }

        private boolean hasPath(char[][] matrix, char[] str) {

            // 记录该下标的元素是否已经访问过了
            boolean[][] visited = new boolean[matrix.length][matrix[0].length];

            int pathLength = 0;

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    if (hasPath(matrix, visited, row, col, pathLength, str)) {
                        return true;
                    }
                }
            }
            return false;
        }

    }


}
