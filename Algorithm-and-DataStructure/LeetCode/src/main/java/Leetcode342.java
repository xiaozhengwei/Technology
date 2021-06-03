import org.junit.jupiter.api.Test;

public class Leetcode342 {

    @Test
    public void run(){

    }

    public boolean isPowerOfFour(int n) {

        return  n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;


    }
}
