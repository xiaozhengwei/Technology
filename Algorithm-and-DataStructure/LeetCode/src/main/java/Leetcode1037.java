import org.junit.jupiter.api.Test;

public class Leetcode1037 {
    public boolean isBoomerang(int[][] points) {
        long yy1= points[1][1]-points[0][1];
        long xx1= points[1][0]-points[0][0];

        long yy2=points[2][1]-points[0][1];
        long xx2=points[2][0]-points[0][0];

        return yy1/xx1!=yy2/xx2;
    }

    @Test
    public void run() {

    }
}