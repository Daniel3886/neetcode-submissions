class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            // Sorting the strings by converting them into 
            // chars and sorting to later convert back to strings
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
