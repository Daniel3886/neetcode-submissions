class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        // [2,20,4,10,3,4,5]
        int longest = 0;
        for(int num : set){ // num - 2
            if(!set.contains(num-1)){
                int currNum = num; // 2
                int streak = 1;

                while (set.contains(currNum + 1)){
                    currNum = currNum + 1;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;

    }
}
