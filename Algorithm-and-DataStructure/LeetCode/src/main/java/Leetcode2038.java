import org.junit.jupiter.api.Test;

public class Leetcode2038 {

    @Test
    public void run() {

    }

    class Solution {
        public boolean winnerOfGame(String colors) {
            int[] f = {0, 0};
            char cur = 'C';
            int cnt = 0;
            char[] chars = colors.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != cur) {
                    cur = chars[i];
                    cnt=1;
                } else {
                    cnt++;
                    if(cnt>=3){
                        f[chars[i]-'A']++;
                    }
                }
            }
            return f[0] > f[1];
        }
    }
}
