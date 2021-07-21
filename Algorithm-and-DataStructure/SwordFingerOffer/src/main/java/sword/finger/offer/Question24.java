package sword.finger.offer;



public class Question24 {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return  null;
        }
        ListNode pNode=head;
        ListNode pReversedHead=null;
        ListNode prev=null;
        while(pNode!=null){
            ListNode next=pNode.next;
            if(next==null){
                pReversedHead=pNode;
            }
            pNode.next=prev;
            prev=pNode;
            pNode=next;
        }
        return pReversedHead;

    }
}
