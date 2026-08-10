// import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        Arrays.sort(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);

        // aaccerr
        // aaccerr
        String resultS = new String(charS);
        String resultT = new String(charT);
        System.out.println(resultS);
        System.out.println(resultT);
        
        if(resultS.equals(resultT)){
            
            return true;
        }

        // for(int i = 0; i < charS.length - 1; i++){
        //     for(int j = 0; j < charS.length - i - 1; j++){
        //         if()
        //     }
        // }
    
        // if(s.length() == t.length()){
        //     if(s.matches(t)){
        //         return true;
        //     }
        // }

        return false;
    }
}
