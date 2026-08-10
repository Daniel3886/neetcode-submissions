class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        // Stack<Integer> nums = new Stack<>();
        // char[] symbols = new char[]{'+', '-', '*', '/'};

        for(String str : tokens){
            if(str.equals("+")){
                // result = a + b;
                stack.push(stack.pop() + stack.pop());
            } else if(str.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if(str.equals("*")){
                stack.push(stack.pop() * stack.pop());
            } else if(str.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
