class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == map.get(c)){
                    System.out.println("Map: " + map.get(c));
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();

        // for(int i = 0; i < s.length(); i++){
        //     char top = stack.peek();
        //     char c = s.charAt(i);

        //     if(
        //          c == ')' && top == '('
        //          || c == ']' && top == '['
        //          || c == '}' && top == '{'
        //     ) {
        //         stack.pop();
                
        //     } else{
        //         return true;
        //         }
        // }

        // return stack.isEmpty();
    }
}
