import org.junit.jupiter.api.Test;

public class Leetcode374 {

    @Test
    public void run() {

    }

    // 1 2 3 4 5
    public int guessNumber(int n) {
        int min = 1;
        int max = n;
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (guess(mid) <= 0) {
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
