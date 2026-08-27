class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int first = 1; int second = 2;
        for(int i = 3; i <= n; i++){
            int third = first + second; // 1 + 2
            first = second; // 1 = 2
            second = third; // 2 = 3
        }

        return second; // 3

        // if(n <= 2) return n;
        // int val = climbStairs(n + (n+1));
        // // climbStairs(n + (n+1)) = 3 + 4 = 7



        // return val; 
    }
}
