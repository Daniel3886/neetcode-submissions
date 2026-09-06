class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];

        for(int num: nums){
            counts[num]++;
        }

        int k = 0;
        for(int i = 0; i < 3; i++){
            while(counts[i] > 0){
                nums[k++] = i;
                counts[i]--;
            }
        }
    }
}