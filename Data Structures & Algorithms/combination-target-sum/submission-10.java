class Solution {
        List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList();
        backtracking(nums, target, cur, 0);
        return res;
    }


    public void backtracking(
        int[] nums,
        int target,
        List<Integer> cur,
        int i
    ) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }

        cur.add(nums[i]);
        backtracking(nums, target - nums[i], cur, i);
        cur.remove(cur.size() - 1);
        backtracking(nums, target, cur, i + 1);
    }
}
