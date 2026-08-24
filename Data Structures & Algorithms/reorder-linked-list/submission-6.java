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


        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            nodes.add(cur);
            cur = cur.next;
        }

        int i = 0, j = nodes.size() - 1;
        while(i < j){
            nodes.get(i).next = nodes.get(j);
            i++;
            if(i >= j){
                break;
            }

            nodes.get(j).next = nodes.get(i);
            j--;
        }

        nodes.get(i).next = null;

    }
}

// Input: head = [2,4,6,8,10] // i = 4, j = 10

// head = [2,10,6,8,4]

// Input: head = [2,4,6,8,10] // i = 6, j = 6 



// head = [2,4,6,8,10]

// Output: [2,10,4,8,6]
