import org.junit.jupiter.api.Test;

public class Leetcode165 {

    @Test
    public void run() {

    }

    class Solution {
        public int compareVersion(String version1, String version2) {
            int v1Length = version1.length();
            int v2Length = version2.length();

            int v1 = 0;
            int v2 = 0;
            while (v1 < v1Length || v2 < v2Length) {
                int x = 0;
                for (; v1 < v1Length && version1.charAt(v1) != '.'; v1++) {
                    x = 10 * x + version1.charAt(v1) - '0';
                }
                v1++;
                int y = 0;
                for (; v2 < v2Length && version2.charAt(v2) != '.'; v2++) {
                    y = 10 * y + version2.charAt(v2) - '0';
                }
                v2++;
                if (x != y) {
                    return x > y ? 1 : -1;
                }

            }
            return 0;

        }
    }
}
