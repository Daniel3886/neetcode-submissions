class Solution {
    int[] mem = new int[46];
    public int climbStairs(int n) {
        if(n <= 2) return n;
        if(mem[n] > 0) return mem[n];
        return mem[n] = climbStairs(n-1) + climbStairs(n-2);
    }
}
