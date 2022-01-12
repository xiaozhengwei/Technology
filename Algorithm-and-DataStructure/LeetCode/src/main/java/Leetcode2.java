import org.junit.jupiter.api.Test;

public class Leetcode2 {

    @Test
    public void run() {
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode phead = new ListNode(0);
            ListNode head = phead;
            // 补位
            int add = 0;
            while (l1 != null || l2 != null) {
                int l1Num = l1 != null ? l1.val : 0;
                int l2Num = l2 != null ? l2.val : 0;
                int sum = l1Num + l2Num + add;
                int tempVal = 0;
                if (sum > 9) {
                    tempVal = sum % 10;
                    add = 1;
                } else {
                    tempVal = sum;
                    add = 0;
                }
                head.next = new ListNode(tempVal);
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            return phead.next;
        }
    }
}
