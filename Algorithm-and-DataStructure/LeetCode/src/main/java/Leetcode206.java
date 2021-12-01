import org.junit.jupiter.api.Test;

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
