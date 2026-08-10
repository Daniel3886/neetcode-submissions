class Solution {
    // i = 0, 3
    // j = 1, 4
    //target = 7

    public int[] twoSum(int[] nums, int target) {
        // int[] sum;
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i : nums){
        //     map.put(nums[i], i);
        // }
        // System.out.println(map);

        // if(map.valueSet() == target)


        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    // sum = {nums[i], nums[j]};
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};

        // int[] keysArray = map.keySet()
        // .stream()
        // .mapToInt(Integer::intValue)
        // .toArray();

        // System.out.println(Arrays.toString(keysArray));
        // System.out.println(keysArray);


        // return keysArray;
    }
}
