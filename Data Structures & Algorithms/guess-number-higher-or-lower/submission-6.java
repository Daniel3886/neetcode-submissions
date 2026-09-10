/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        // n = 5
        int L = 1, R = n;
        int mid;

        while(L <= R){
            mid = L + (R - L) / 2;

            // 1, 2, 3, 4, 5
            if(guess(mid) > 0){
                L = mid + 1;
            } else if(guess(mid) < 0){
                R = mid - 1;
            } else {
                return mid;
            }
            
        }

        return -1;
    }
    // usually we would implement this ourselves
    // public static int isCorrect(int n){
    //     if(n > 10){
    //         return 1;
    //     } else if(n < 10){
    //         return -1;
    //     } else {
    //         return 0;
    //     }
    // }
}