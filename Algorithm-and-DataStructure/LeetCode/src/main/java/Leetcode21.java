import org.junit.jupiter.api.Test;

public class Leetcode21 {
    @Test
    public void run(){
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);


        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);

        Solution solution=new Solution();
        solution.mergeTwoLists(list1,list2);
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode ptr1=list1;
            ListNode ptr2=list2;
            ListNode head=new ListNode(0);
            ListNode pHead=head;
            while(ptr1!=null||ptr2!=null){
                if(ptr1==null){
                    pHead.next=ptr2;
                    ptr2=ptr2.next;
                    pHead=pHead.next;
                    pHead.next=null;
                    continue;
                }
                if(ptr2==null){
                    pHead.next=ptr1;
                    ptr1=ptr1.next;
                    pHead=pHead.next;
                    pHead.next=null;
                    continue;
                }
                if(ptr2.val>ptr1.val){
                    pHead.next=ptr1;
                    ptr1=ptr1.next;
                    pHead=pHead.next;
                    pHead.next=null;
                }else{
                    pHead.next=ptr2;
                    ptr2=ptr2.next;
                    pHead=pHead.next;
                    pHead.next=null;
                }
            }
            return head.next;
        }
    }
}
