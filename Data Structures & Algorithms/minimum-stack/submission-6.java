class MinStack {
    // HashMap<String> map = new HashMap<>();
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        int top = stack.peek();
        return top;
    }
    
    public int getMin() {
        int min = stack.stream().min(Integer::compare).orElseThrow();
        return min;
    }
}
