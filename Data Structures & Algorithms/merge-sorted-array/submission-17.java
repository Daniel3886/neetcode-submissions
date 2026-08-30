class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] L = new int[m];
        int[] R = new int[n];

        for(int i = 0; i < m; i++){
            L[i] = nums1[i];
        }

        for(int j = 0; j < n; j++){
            R[j] = nums2[j];
        }

        int i = 0, j = 0;
        int k = 0; 
        while(i < m && j < n){
            if(L[i] <= R[j]){
                nums1[k] = L[i];
                i++;
            } else {
                nums1[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<m){
            nums1[k] = L[i];
            i++;
            k++;
        }

        while(j<n){
            nums1[k] = R[j];
            j++;
            k++;
        }
    }
}