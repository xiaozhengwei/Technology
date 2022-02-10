import org.junit.jupiter.api.Test;

public class Leetcode19 {

    @Test
    public void run(){
        Solution solution=new Solution();
    }


    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            ListNode first = head;
            ListNode second = dummy;
            for (int i = 0; i < n; ++i) {
                first = first.next;
            }
            while (first != null) {
                first = first.next;
                second = second.next;
            }
            second.next = second.next.next;
            ListNode ans = dummy.next;
            return ans;
        }
    }

}
