class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(nums, 0, target, new ArrayList<>(), res);
        return res;
    }


    public static void backtracking(
        int[] nums,
        int start,
        int target,
        List<Integer> arr,
        List<List<Integer>> res
    ){
        if (target == 0) {
            res.add(new ArrayList<>(arr));
            return;
        }
        if (target < 0) {
            return;
        }

        for(int i = start; i < nums.length; i++){ 
            arr.add(nums[i]);
            backtracking(nums, i, target - nums[i], arr, res);
            arr.remove(arr.size() - 1);
        }

    }
}
