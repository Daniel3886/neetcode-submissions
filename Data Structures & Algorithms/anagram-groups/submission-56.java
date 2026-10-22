class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
    
    return new ArrayList<>(anagrams.values());

    }
}
