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

        int prod = 1, zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                res[i] = (nums[i] == 0) ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  


// nums 0 -> 2*4*6 = 48
// nums 1 - > 1*4*6 = 24
// nums 3 -> 1*2*6 = 12
// nums 4 -> 1*2*4 = 8