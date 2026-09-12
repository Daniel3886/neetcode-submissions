class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int L = 1;
        int R = 1;

        for (int pile: piles) {
            R = Math.max(R, pile);
        }

        while (L < R) { 
            int mid = L + (R - L) / 2;

            if (canFinish(mid, piles, h)) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }

    public static boolean canFinish(int k, int[] arr, int h) {
        long totalHours = 0;
        for (int pile : arr) {
            totalHours += (pile + (long)k - 1) / k;
        }
        return totalHours <= h;
    }
}