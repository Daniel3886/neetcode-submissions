class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int curMax = 0;
        int curMin = 0;
        int sumTotal = 0;

        for(int n : nums){
            sumTotal += n;            
            
            curMax = Math.max(curMax, 0);
            curMax += n;

            curMin = Math.min(curMin, 0);
            curMin += n;


            maxSum = Math.max(maxSum, curMax);
            minSum = Math.min(minSum, curMin);
        }

        System.out.println("MAX: " + maxSum);
        System.out.println("MIN: " + minSum);
    

        if (maxSum < 0) {
            return maxSum;
        }

        System.out.println("MAX: " + maxSum);
        System.out.println("MIN: " + minSum);
        

        return Math.max(maxSum, sumTotal - minSum);

    }
}