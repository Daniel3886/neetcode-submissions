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
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            arr.add(current);
            current = current.next;
        }

        int len = arr.size();
        int R = len - n; // 3 - 2 = 1

        if(R == 0){
            return head.next;
        }

        ListNode before = arr.get(R-1);
        before.next = before.next.next;


        return head; // 2, 4 
        // 1, 2, 4
    }
}
