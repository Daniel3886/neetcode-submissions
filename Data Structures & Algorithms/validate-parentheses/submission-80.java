class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(
                s.charAt(i) =='[' ||
                s.charAt(i) == '(' ||
                s.charAt(i) == '{'
            ) {
                stack.push(s.charAt(i));
                System.out.println("S char: " + s.charAt(i));
                System.out.println(stack);
            }

            if(s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}'){
                if(stack.isEmpty()) return false;

                char topVal = stack.pop();
                char current = s.charAt(i);
                // System.out.println("S char: " + s.charAt(i));

                if(current == ']' && topVal != '[') return false;
                if(current == ')' && topVal != '(') return false;
                if(current == '}' && topVal != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}
