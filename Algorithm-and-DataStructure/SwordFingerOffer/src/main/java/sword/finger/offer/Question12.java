package sword.finger.offer;

public class Question12 {

    private static boolean hasPath(char[][] matrix, boolean[][] visited, int row, int col, int pathLength, char[] str) {

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

    private static boolean hasPath(char[][] matrix, char[] str) {

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

    public static void main(String[] args) {

        /*
         * a b t g
         * c f c s
         * j d e h
         */
        char[][] matrix = {{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'j', 'd', 'e', 'h'}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        char[] str1 = {'b', 'f', 'c', 'e'};
        char[] str2 = {'a', 'b', 'f', 'b'};
        System.out.println(hasPath(matrix, str1));
        System.out.println(hasPath(matrix, str2));
    }

}
