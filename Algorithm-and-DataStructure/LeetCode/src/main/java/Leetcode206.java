import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.HashMap;

public class Leetcode206 {

    @Test
    public void run() {
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode prev = null;
            ListNode cursor = head;
            while (cursor != null) {
                ListNode next = cursor.next;
                cursor.next = prev;
                prev = cursor;
                cursor = next;
            }
            return prev;
        }
    }
}
