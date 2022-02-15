import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leetcode141 {

    @Test
    public void run() {

    }

    public class Solution {
        // Hash表
//        public boolean hasCycle(ListNode head) {
//            Set<ListNode> set=new HashSet<>();
//            ListNode phead=head;
//            while(phead!=null){
//                set.add(phead);
//                ListNode next=phead.next;
//                if(set.contains(next)){
//                    return true;
//                }
//                phead=phead.next;
//            }
//            return false;
//        }
        // 快慢指针
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }

            ListNode slow = head;
            ListNode quick = head.next;
            while (slow != quick) {
                if(quick==null||quick.next==null){
                    return false;
                }
                slow=slow.next;
                quick=quick.next.next;
            }
            return true;
        }
    }

}
