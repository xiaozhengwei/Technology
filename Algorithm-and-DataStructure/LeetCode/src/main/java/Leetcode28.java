import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class Leetcode28 {

    @Test
    public void run(){

    }

    class Solution {
        public int strStr(String haystack, String needle) {
            char[] haystacks = haystack.toCharArray();
            char[] needles = needle.toCharArray();
            int haystacksLength = haystacks.length;
            int needlesLength = needles.length;


            if ("".equals(haystack) && "".equals(needle)) {
                return 0;
            }

            if("".equals(needle)){
                return 0;
            }

            if(needlesLength>haystacksLength){
                return -1;
            }

            char baseChar = needles[0];
            int repeatIndex = -1;
            boolean isFirst = true;

            for (int i = 0; i < haystacksLength; ) {
                int j = 0;
                for (; j < needlesLength; j++) {
                    if (haystacks[i + j] == baseChar && isFirst) {
                        repeatIndex = i + j;
                        isFirst = false;
                    }

                    if (haystacks[i + j] != needles[j]) {
                        break;
                    }
                }
                if (j == needlesLength) {
                    return i;
                }
                isFirst = true;

                if (repeatIndex >= i + 1) {
                    i = repeatIndex;
                } else {
                    i++;
                }
            }

            return -1;
        }
    }
}
