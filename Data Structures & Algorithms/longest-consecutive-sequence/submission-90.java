class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>(nums.length);
        for(int n : nums){
            set.add(n);
        }
        int longest = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int length = 1;
                while(set.contains(num + length)){
                    length++;
                }
            longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}

// 2, 3, 4, 4, 5
// 7