import org.junit.jupiter.api.Test;

public class Leetcode374 {

    @Test
    public void test1() {

    }

    // 1 2 3 4 5
    public int guessNumber(int n) {
        if (n == 1) {
            return guess(n);
        }
        int min = 1;
        int max = n;
        while (min < max) {
            int mid = (max + min) / 2;
            if (guess(min) <= 0) {
                max = mid;
            } else {
                min = min + 1;
            }
        }
        return min;
    }

    int guess(int num) {
        return 0;
    }
}
