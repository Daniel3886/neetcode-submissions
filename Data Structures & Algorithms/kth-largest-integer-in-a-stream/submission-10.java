class KthLargest {

    ArrayList<Integer> res;
    int K = 0;
    public KthLargest(int k, int[] nums) {
        res = new ArrayList<>();
        K = k;

        for(int i: nums){
            res.add(i);
        }
    }
    
    public int add(int val) {
        res.add(val);
        Collections.sort(res);
        return res.get(res.size() - K);
    }
}
