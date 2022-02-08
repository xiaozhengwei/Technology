import org.junit.jupiter.api.Test;

public class Leetcode19 {

    @Test
    public void run(){
        Solution solution=new Solution();
    }


    class Solution {

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow=head;
            ListNode quick=head;
            for(int i=0;i<n;i++){
                quick=quick.next;
            }
            while(quick.next!=null){
                quick=quick.next;
                slow=slow.next;
            }
            ListNode temp=slow.next;
            slow.next=temp.next;
            temp=null;
            return head;
        }

    }
}
