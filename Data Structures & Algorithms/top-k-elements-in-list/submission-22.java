class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // nums=[1,2,2,3,3,3]
        // k=2
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // map:
        // key - 1, 2, 3
        // val - 1, 2, 3

        // if key.val >= k
        // return arr[val]

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){ // key - 1, 2, 3
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k]; // 2
        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll();
        }

        return result;     
    }
}
