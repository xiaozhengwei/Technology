import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Leetcode794 {

    @Test
    public void run() {

    }

    class Solution {
        public boolean validTicTacToe(String[] board) {
            char[][] chars = new char[3][3];
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char temp = board[i].charAt(j);
                    chars[i][j] = temp;
                    map.merge(temp, 1, Integer::sum);
                }
            }
            int xCount = map.get('X') == null ? 0 : map.get('X');
            int oCount = map.get('O') == null ? 0 : map.get('O');
            if (xCount < oCount || (xCount > oCount && xCount - oCount > 1)) {
                return false;
            }


            return true;

        }

        public boolean win(String[] board, char p) {
            for (int i = 0; i < 3; ++i) {
                if (p == board[0].charAt(i) && p == board[1].charAt(i) && p == board[2].charAt(i)) {
                    return true;
                }
                if (p == board[i].charAt(0) && p == board[i].charAt(1) && p == board[i].charAt(2)) {
                    return true;
                }
            }
            if (p == board[0].charAt(0) && p == board[1].charAt(1) && p == board[2].charAt(2)) {
                return true;
            }
            if (p == board[0].charAt(2) && p == board[1].charAt(1) && p == board[2].charAt(0)) {
                return true;
            }
            return false;
        }
    }
}
