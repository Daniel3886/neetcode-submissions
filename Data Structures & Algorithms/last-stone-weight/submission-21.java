class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // stones = [2,3,6,2,4]
        for(int val : stones){
            minHeap.add(-val);
        }

        // minHeap = [-6,-4,-3,-2,-2]
        while(minHeap.size() > 1){
            int x = minHeap.poll();
            int y = minHeap.poll();
            if(x < y) {
                minHeap.add(x-y); // -6 + 4 = -2
            }
        }

        minHeap.add(0);
        return Math.abs(minHeap.peek());
    }
}
