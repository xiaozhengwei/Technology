package sword.finger.offer;

import java.util.List;

public class Leetcode206 {


    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode prev=null;
            ListNode cursor=head;
            while(cursor!=null){
                ListNode next=cursor.next;
                cursor.next=prev;
                prev=cursor;
                cursor=next;
            }
            return prev;
        }
    }
}
