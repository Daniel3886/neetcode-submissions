class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3]; // 0, 0, 0

        // nums = [1,0,1,2]
        for(int num: nums){ 
            counts[num]++;
            // 0 - 1
            // 1 - 2
            // 2 - 1
        }

        int index = 0;
        for(int color = 0; color < 3; color++){
            // while i > 0 then fill the nums array
            while(counts[color] > 0){ // 2 > 0
                nums[index++] = color; 
                counts[color]--;
            } 
        }
    }
}