class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for(int[] point : points){
            int dist = point[0] * point[0] + point[1] * point[1]; // 1 * 1 + 3 * 3 = 10, 8
            minHeap.offer(new int[]{dist, point[0], point[1]}); // 10, 1, 3
        }
        // 1st pass
        // dist = 10
        // minHeap[10, 1, 3]
        // 2nd pass
        // dist = 8
        // minHeap[10, 1, 3][8, -2, 2]

        int[][] result = new int[k][2]; // k - 1
        for(int i = 0; i < k; i++){
            int[] point = minHeap.poll(); // [8, -2, 2]
            result[i] = new int[]{point[1], point[2]}; // i - 0, [-2, 2]
        }
        return result; // [-2, 2]

        // [1, 3], [-2, 2]
    }
}
