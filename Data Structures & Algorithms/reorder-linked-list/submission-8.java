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
    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }

        ListNode crt = head;
        ArrayList<ListNode> nodes = new ArrayList<>();

        while(crt != null){
            nodes.add(crt);
            crt = crt.next;
        }

        int L = 0, R = nodes.size() - 1;
        while(L < R){
            nodes.get(L).next = nodes.get(R);
            L++;
            if(L >= R){
                break;
            }
            nodes.get(R).next = nodes.get(L);
            R--;
        }

        nodes.get(L).next = null;
    }
}
