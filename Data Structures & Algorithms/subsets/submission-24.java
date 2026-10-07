class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        backtrack(nums, 0, subset, res);
        return res;
    }

    // i is the index of 1,2,3
    public void backtrack(
        int[] nums,
        int i,
        List<Integer> subset,
        List<List<Integer>> res
        ) {
            // if the index goes after 3 (aka OutOfBounds),
            // we know the traversal is complete stop the execution 
            if(i >= nums.length){
                res.add(new ArrayList<>(subset));
                return;
            }

            // decision to include nums[i]
            backtrack(nums, i+1, subset, res);
            subset.add(nums[i]);

            // decision to NOT include nums[i]
            backtrack(nums, i+1, subset, res);
            subset.remove(subset.size() - 1);
        }
}
