package sword.finger.offer;

public class Question25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode receivedNode = null;
        if (l1.val < l2.val) {
            receivedNode = l1;
            receivedNode.next = mergeTwoLists(l1.next, l2);
        } else {
            receivedNode = l2;
            receivedNode.next = mergeTwoLists(l1, l2.next);
        }
        return receivedNode;
    }
}
