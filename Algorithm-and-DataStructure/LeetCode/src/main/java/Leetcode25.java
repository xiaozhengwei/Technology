import org.junit.jupiter.api.Test;

public class Leetcode25 {
    @Test
    public void run(){
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);
        list1.next.next.next=new ListNode(5);
        Solution solution=new Solution();
        solution.reverse(list1,list1.next.next);
        System.out.println(1);
    }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            // 用于标志
            int sign=0;

            return head;
        }

        public void reverse(ListNode head,ListNode tail){
            ListNode ptrHead=head;
            ListNode end=tail.next;
            while(ptrHead!= tail){
                ListNode temp=ptrHead.next;
                ptrHead.next= tail.next;
                tail.next=ptrHead;
                ptrHead=temp;
            }
            head.next=end;
        }
    }
}
