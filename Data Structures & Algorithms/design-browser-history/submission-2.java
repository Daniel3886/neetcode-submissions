class BrowserHistory {

    private class ListNode{
        String val;
        ListNode prev;
        ListNode next;

        ListNode(String val){
            this.val = val;
        }
    }

    ListNode current;
    public BrowserHistory(String homepage) {
        current = new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode node = new ListNode(url);
        current.next = node;
        node.prev = current;
        current = node;   
    }
    
    public String back(int steps) {
        while(steps > 0 && current.prev != null){
            current = current.prev;
            steps--;
        }


        return current.val;
    }
    
    public String forward(int steps) {
        while(steps > 0 && current.next != null){
            current = current.next;
            steps--;
        }

        return current.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */