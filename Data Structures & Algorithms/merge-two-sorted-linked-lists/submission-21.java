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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            // Check if the node 1's values are smaller than node 2
            if (list1.val <= list2.val) {

                // add the nodes to the dummy node 
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            } else {

                // else condition for the other smaller digits found in node 2
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }

        if(list1 != null){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        } 


        if(list2 != null){
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        } 
        

        // return combined nodes from ascending order
        return dummy.next;
    }
}