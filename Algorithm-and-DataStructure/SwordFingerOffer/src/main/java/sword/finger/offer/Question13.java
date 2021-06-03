package sword.finger.offer;

public class Question13 {


    private static int movingCount(int m, int n, int k) {

        if (k < 0 || m < 0 || n < 0) {
            return 0;
        }

        boolean[][] visited = new boolean[m][n];

        return count(m, n, k, 0, 0, visited);

    }

    public static int count(int m, int n, int k, int row, int col, boolean[][] visited) {
        int count = 0;
        if (row >= 0 && row < m &&
                col >= 0 && col < n &&
                !visited[row][col]
                && getDigitSum(row) + getDigitSum(col) <= k
        ) {
            visited[row][col] = true;
            count = 1 +
                    count(m, n, k, row + 1, col, visited) +
                    count(m, n, k, row + 1, col, visited) +
                    count(m, n, k, row, col + 1, visited) +
                    count(m, n, k, row, col + 1, visited);
        }
        return count;

    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }


    public static void main(String[] args) {

    }
}
