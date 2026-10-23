class KthLargest {

    int K= 0;
    List<Integer> res;
    public KthLargest(int k, int[] nums) {
        K = k;
        res = new ArrayList<>();
        for(int val: nums){
            res.add(val);
        }
    }
    
    public int add(int val) {
        res.add(val);
        Collections.sort(res);

        return res.get(res.size() - K);
    }
}
