class Solution {
    public boolean isPalindrome(String s) {
        String val = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Val: " + val);
        String reversedStr = new StringBuilder(val).reverse().toString();
        System.out.println("reversedStr: " + reversedStr);

        if(val.equals(reversedStr)){
            return true;
        }

        return false;
    }
}
