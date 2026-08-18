class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int firstVal = stack.pop();
                int secondVal = stack.peek();
                stack.push(firstVal);
                stack.push(firstVal + secondVal);
            } else if(operations[i].equals("C")){
                stack.pop();
            } else if(operations[i].equals("D")){
                int val = stack.peek();
                stack.push(val*2);
            } else {
                int parse = Integer.parseInt(operations[i]);
                stack.push(parse);
            }
        }

        int result = 0;

        for(int el : stack){
            result += el;
        }

        return result;
    }
}