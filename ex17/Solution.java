
public class Solution {

    public ListNode mergeNodes(ListNode head) {
        ListNode listNode = new ListNode();
        ListNode ptr = listNode;
        int s = 0;
        head = head.next;
        while (head != null) {
            if (head.val == 0) {
                ListNode res = new ListNode(s);
                ptr.next=res;
                ptr=ptr.next;
                s=0;
            } else {
                s += head.val;
            }
            head = head.next;
        }
        return listNode.next;
    }
}
class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}