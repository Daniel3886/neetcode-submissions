class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean result = false;

        for(int i = 0; i < s.length(); i++){
            if(
                s.charAt(i) =='[' ||
                s.charAt(i) == '(' ||
                s.charAt(i) == '{'
            ) {
                stack.push(s.charAt(i));
            } 


            char current = s.charAt(i);
            if (current == ')' || current == '}' || current == ']') {
                
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                
                if (current ==')' && top != '(') return false;
                if (current ==']' && top != '[') return false;
                if (current =='}' && top != '{') return false;

            } 
        }

        return stack.isEmpty();
    }
}
