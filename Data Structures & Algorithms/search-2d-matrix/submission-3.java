class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        
        int L = 0, R = (m*n) - 1;

        while(L <= R){
            int mid = L + ((R - L) / 2);
            int val = matrix[mid / n][mid % n];

            if(val < target){
                L = mid + 1;
            }else if(val > target){
                R = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}