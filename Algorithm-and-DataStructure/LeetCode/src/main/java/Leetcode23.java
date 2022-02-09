import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leetcode23 {

    @Test
    public void run(){
        Solution solution=new Solution();
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);


        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);
        ListNode []nodes={list1,list2};
        solution.mergeKLists(nodes);
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            List<Integer> list=new ArrayList<>();

            for(ListNode node:lists){
                while(node!=null){
                    list.add(node.val);
                    node=node.next;
                }
            }
            Collections.sort(list);
            ListNode head=new ListNode(0);
            ListNode phead=head;
            for(Integer num:list){
                head.next=new ListNode(num);
                head=head.next;
            }
            return phead.next;
        }
    }
}
