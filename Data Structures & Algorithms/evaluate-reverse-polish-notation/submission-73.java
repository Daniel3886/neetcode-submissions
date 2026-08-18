class Solution {
    public int evalRPN(String[] tokens) {

     Stack<Integer> stack = new Stack<>();

     for(String val : tokens){
        if(val.equals("+")){
            int a = stack.pop();
            int b = stack.pop();
            stack.push(a+b);
        } else if(val.equals("*")){
            int a = stack.pop();
            int b = stack.pop();
            stack.push(a*b);
        } else if(val.equals("-")){
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b-a);
        } else if(val.equals("/")){
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b/a);
        } else {
            int num = Integer.parseInt(val);
            stack.push(num);
        }
     }

        return stack.pop();
    }
}
