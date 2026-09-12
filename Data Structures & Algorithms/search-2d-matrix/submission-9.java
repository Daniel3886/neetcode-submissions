class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length; // 12
        int n = matrix[0].length; // 4
        int L = 0, R = (m*n) - 1; // 0, 11

        while(L <= R){
            int mid = L + (R-L) / 2; // 5

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
