class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int L = 0, R = (m*n) - 1;

        while(L <= R){
            int mid = L + (R-L) / 2;

            if(matrix[mid/n][mid % n] < target){
                L = mid + 1;
            } else if (matrix[mid/n][mid % n] > target){
                R = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
