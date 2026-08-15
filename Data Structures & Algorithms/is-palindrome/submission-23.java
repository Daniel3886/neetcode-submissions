class Solution {
    public boolean isPalindrome(String s) {
        String word = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int R = word.length() - 1;

        for(int L = 0; L < word.length(); L++){
            if(word.charAt(L) != word.charAt(R)){
                return false;
            }
            R--;
        }

        return true;
    }
}
