class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){ // tops
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // opst (this is due to sorting the string)

                            // "opst" -> [] 
            map.putIfAbsent(key, new ArrayList<>()); // intially we just add the key which is "opst"

            // "opst" -> ["tops"]
            map.get(key).add(s); // only here we add the value of the key 
        }

        return new ArrayList<>(map.values());
    }
}