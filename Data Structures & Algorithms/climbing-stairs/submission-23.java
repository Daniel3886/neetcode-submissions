class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;

        int first = 1; int second = 2;
        for(int i = 3; i <= n; i++){
            int third = first + second; // 1 + 2 = 3
            first = second; // 1 = 2
            second = third; // 2 = 3
        }

        // n = 4
        // 1 + 1 + 1 + 1
        // 1 + 1 + 2
        // 1 + 2 + 1
        // 2 + 1 + 1
        // 2 + 2

        return second;
    }
}
