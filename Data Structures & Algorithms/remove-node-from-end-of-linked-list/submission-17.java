/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        List<ListNode> dummy = new ArrayList<>();
        while(current != null){
            dummy.add(current);
            current = current.next;
        }

        int len = dummy.size();
        int R = len - n;

        if (R == 0) {
            return head.next;
        }

        ListNode before = dummy.get(R - 1);
        before.next = before.next.next;


        return head;

}
}