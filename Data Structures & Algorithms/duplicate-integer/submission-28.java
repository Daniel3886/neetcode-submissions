class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : nums){
            if(map.containsKey(val)) return true;
            map.put(val, 1);
        }

        return false;
    }
}