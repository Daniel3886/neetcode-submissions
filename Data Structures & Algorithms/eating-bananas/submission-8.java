class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int L = 1;
        int R = 1;

        // [1,4,3,2]
        for (int pile: piles) {
            R = Math.max(R, pile); // 4
        }

        while (L < R) { 
            int mid = L + (R - L) / 2; // 1 + (4-1) / 2 = 2

            if (canFinish(mid, piles, h)) { // 2, ... , 9
                R = mid; // 2
            } else {
                L = mid + 1;
            }
        }
        return L;
    }

    public static boolean canFinish(int k, int[] arr, int h) { // 2
        long totalHours = 0;
        for (int pile : arr) {
            totalHours += (pile + (long)k - 1) / k; // (1,4,3,2 + 1 -1) / 1
        }
        return totalHours <= h; // 1<=9
    }
}