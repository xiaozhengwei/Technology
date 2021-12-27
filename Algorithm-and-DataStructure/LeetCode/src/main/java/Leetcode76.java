import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Leetcode76 {

    @Test
    public void run(){

    }

    class Solution {
        public String minWindow(String s, String t) {
            // 存放t字符的数量，方便进行比对
            Map<Character, Integer> TMap = new HashMap<>();
            // 存放由截取的s字符数量
            Map<Character, Integer> SMap = new HashMap<>();
            for (char charArray : t.toCharArray()) {
                TMap.put(charArray, TMap.getOrDefault(charArray, 0) + 1);
            }
            int left = 0, start = 0, total = 0, len = Integer.MAX_VALUE;
            for (int right = 0; right < s.length(); right++) {
                char RChar = s.charAt(right);
                // TMap如果存在右指针所指字符，SMap将添加所指字符数量
                if (TMap.containsKey(RChar)) {
                    SMap.put(RChar, SMap.getOrDefault(RChar, 0) + 1);
                    // 当TMap的右指针所指字符数量与SMap的右指针所指字符数量相等时，对total数量加一
                    if (SMap.get(RChar).equals(TMap.get(RChar))) {
                        total++;
                    }
                }
                // 当total达到TMap字符种类数时寻找最小值
                while (total == TMap.size()) {
                    if (right - left + 1 < len) {
                        len = right - left + 1;
                        // 记录最小值一开始的位置
                        start = left;
                    }
                    // 获取左指针当前字符，并将左指针左移
                    char LChar = s.charAt(left++);
                    if (SMap.containsKey(LChar)) {
                        // 当LChar的个数相等时，说明左指针左移一位后肯定不相等，所以total减一
                        if (SMap.get(LChar).equals(TMap.get(LChar))) {
                            total--;
                        }
                        SMap.put(LChar, SMap.get(LChar) - 1);
                    }
                }
            }
            return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
        }
    }

}
