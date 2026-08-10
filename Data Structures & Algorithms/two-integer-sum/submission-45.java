class Solution {
    // i = 0, 3
    // j = 1, 4
    //target = 7

    public int[] twoSum(int[] nums, int target) {
        // int[] sum;
        Map<Integer, Integer> prevMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int diff = target - n;

            if(prevMap.containsKey(diff)){  
                return new int[]{prevMap.get(diff), i};
            }
        prevMap.put(n, i);
        }

        return new int[]{};

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target && i != j){
        //             // sum = {nums[i], nums[j]};
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        // return new int[]{};

        // int[] keysArray = map.keySet()
        // .stream()
        // .mapToInt(Integer::intValue)
        // .toArray();

        // System.out.println(Arrays.toString(keysArray));
        // System.out.println(keysArray);


        // return keysArray;
    }
}
