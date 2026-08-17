class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")) {
                int firstVal = stack.pop();
                int secondVal = stack.peek();
                int add = firstVal + secondVal;
                stack.push(firstVal);
                stack.push(add);
            } else if(operations[i].equals("C")){
                stack.pop();
            } else if(operations[i].equals("D")){
                int lastVal = stack.peek();
                stack.push(lastVal * 2);
            } else {
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
            }
        }

        int result = 0;
        for(int el : stack){
            result += el;
        }

        return result;
    }
}