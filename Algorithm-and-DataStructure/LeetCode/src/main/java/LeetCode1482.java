import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode1482 {

    @Test
    public void run() {

    }

    public int minDays(int[] bloomDay, int m, int k) {

        int result = 0;
        int maxFollowerCount = bloomDay.length;
        if (maxFollowerCount < m * k) {
            return -1;
        }

        List<Integer> list = new ArrayList<>();

        for (int day : bloomDay) {
            list.add(day);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return bloomDay[m * k - 1];
    }

}