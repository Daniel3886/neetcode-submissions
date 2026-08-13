class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int count = 0;
        int current = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
                // if(nums[i] == 1 && nums[i+1] == 1){
                //     count++;
                // }
            if(nums[i] == 1){
                current++;
            } else {
                current = 0;
            }
            max = Math.max(max, current);
        //  System.out.println("current: " + current);
        //  System.out.println("max: " + max);

        }

        return max;
    }
}