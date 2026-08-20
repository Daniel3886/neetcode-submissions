class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val){
            this.val = val;
        }
    }

    ListNode head; // left
    ListNode tail; // right
    public MyLinkedList() {
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail; // tail is the last/next element for head node
        tail.prev = head; // head is the first/prev element for tail node
    }
    
    public int get(int index) {
        ListNode curr = head.next;
        while(curr != null && index > 0){
            curr = curr.next;
            index--;
        }

        if(curr != null && curr != tail && index == 0){
            return curr.val;
        }

        return -1;
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        ListNode next = head.next;
        ListNode prev = head;

        node.next = next;
        node.prev = prev;
        next.prev = node;
        prev.next = node;
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode next = tail;
        ListNode prev = tail.prev;

        node.next = next;
        node.prev = prev;
        next.prev = node;
        prev.next = node;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode curr = head.next;

        while(curr != null && index > 0){
            curr = curr.next;
            index--;
        }

        if(curr != null && index == 0){
            ListNode node = new ListNode(val);
            ListNode next = curr;
            ListNode prev = curr.prev;


            node.next = next;
            node.prev = prev;
            next.prev = node;
            prev.next = node;
        }
    }
    
    public void deleteAtIndex(int index) {
        ListNode curr = head.next;

        while(curr != null && index > 0){
            curr = curr.next;
            index--;
        }
        if(curr != null && curr != tail && index == 0){
            ListNode next = curr.next;
            ListNode prev = curr.prev;
            prev.next = next;
            next.prev = prev;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */