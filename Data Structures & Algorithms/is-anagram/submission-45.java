class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            mapS.put(charS, mapS.getOrDefault(charS, 0) + 1);
            mapT.put(charT, mapT.getOrDefault(charT, 0) + 1);
        }
        System.out.println(mapS);

        System.out.print(mapT);
        
        return mapS.equals(mapT);
    }
}
