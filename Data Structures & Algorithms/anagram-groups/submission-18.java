class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
        char[] chars = s.toCharArray();
        System.out.println("S: " + s);
        Arrays.sort(chars);
        String sortedS = new String(chars);
        System.out.println("Sorted S: " + sortedS);
        map.putIfAbsent(sortedS, new ArrayList<>());
        map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
