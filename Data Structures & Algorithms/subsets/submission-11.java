class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return backtrack(nums, 0, new ArrayList<>(), new ArrayList<>());
    }

    public static List<List<Integer>> backtrack(
        int[] arr,
        int start,
        List<Integer> current,
        List<List<Integer>> res
    ) {

        res.add(new ArrayList<>(current));

        for(int i = start; i < arr.length; i++){
            current.add(arr[i]);
            backtrack(arr, i + 1, current, res);
            current.remove(current.size() - 1);
        }

        return res;
    }
}
