import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode386 {

    @Test
    public void run() {
        Solution solution = new Solution();
        List<Integer> results=solution.lexicalOrder(1000);
        System.out.println(results);
    }


    class Solution {
        public List<Integer> lexicalOrder(int n) {
            List<Integer> results = new ArrayList<>();
            int number = 1;
            for (int i = 0; i < n; i++) {
                results.add(number);
                if (number * 10 < n) {
                    number = number * 10;
                } else {
                    while (number % 10 == 9 || number + 1 > n) {
                        number = number / 10;
                    }
                    number++;
                }
            }
            return results;
        }

    }


}
