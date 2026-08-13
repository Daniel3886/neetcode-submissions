class Solution {
    public boolean isPalindrome(String s) {
        String word = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int L = 0, R = word.length() - 1;

        System.out.println("word: " + word); 

        while(L < R){
            if(word.charAt(L) != word.charAt(R)){
                return false;
            }
                R--;
                L++;
        }

        return true;
    }
}
