import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Leetcode142 {

    @Test
    public void run(){

    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            Set<ListNode> set=new HashSet<>();
            ListNode phead=head;
            while(phead!=null){
                set.add(phead);
                ListNode next=phead.next;
                if(set.contains(next)){
                    return next;
                }
                phead=phead.next;
            }
            return null;
        }
    }
}
