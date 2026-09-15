class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int L = 1, R = 1;

        for(int pile: piles){
            R = Math.max(R, pile);
        }

        while(L<R){
            int mid = L + (R-L) / 2;

            if(canFinish(mid, piles, h)){
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        
        return L;
    }


    public static boolean canFinish(int k, int[] piles, int h){
        long totalTime = 0;
        for(int pile: piles){ // [1,4,3,2] 1+2-1 / 9
            totalTime += (pile + k - 1) / k;
        }

        return totalTime <= h;
    }
}
