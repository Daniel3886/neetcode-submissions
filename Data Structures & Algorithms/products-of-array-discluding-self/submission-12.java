class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int[] arr = new int[];
        // for nums = [1,2,4,6] the length is 4
        // int[] result = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     int value = 1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j){
        //             value *= nums[j];
        //         }
        //     }

        //     result[i] = value;
        // }

        int prefixLeft = 1;
        int prefixRight = 1;

        int[] ans = new int[nums.length];

        // left to right
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefixLeft;
            prefixLeft *= nums[i];
        }

        // right to left
        for (int i = nums.length - 1; i >= 0; i--)  {
            ans[i] *= prefixRight;
            prefixRight *= nums[i];
        }

        return ans;
    }
}  


// nums 0 -> 2*4*6 = 48
// nums 1 - > 1*4*6 = 24
// nums 3 -> 1*2*6 = 12
// nums 4 -> 1*2*4 = 8