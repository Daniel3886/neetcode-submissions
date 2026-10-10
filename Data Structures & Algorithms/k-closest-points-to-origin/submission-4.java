class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        return Arrays.copyOfRange(points, 0, k);
    }
    
    // 1 * 1 + 3*3 = 10
    // 4 + 4 = 8
    // 10-8 = 2

    // [1, 3], [-2, 2]
}
