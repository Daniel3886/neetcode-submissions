class Solution {
    public int search(int[] nums, int target) {
        // L = 0
        // R = 6
        int L = 0, R = nums.length - 1;


        while(L <= R){
            // 6 + 0 / 2 = 3
            int mid = (L+R) / 2;

            // 3 < 4
            if(target > nums[mid]){
                L = mid + 1;
            } else if(target < nums[mid]){
                R = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
