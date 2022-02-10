import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1447 {

    @Test
    public void run() {
        Solution solution = new Solution();

    }

    class Solution {
        public List<String> simplifiedFractions(int n) {
            if (n <= 1) {
                return new ArrayList<>();
            }
            List<String> result = new ArrayList<>();
            for (int denominator = 2; denominator <= n; denominator++) {
                for (int molecule = 1; molecule < denominator; molecule++) {
                    if (isSimplest(molecule, denominator)) {
                        result.add(molecule + "/" + denominator);
                    }
                }
            }

            return result;
        }

        public boolean isSimplest(int molecule, int denominator) {
            if (molecule == 1) {
                return true;
            }
            for (int i = 2; i <= molecule; i++) {
                if (molecule % i == 0 && denominator % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
