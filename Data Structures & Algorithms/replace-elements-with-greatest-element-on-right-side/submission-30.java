class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0, currentMax = -1;

        for(int i = arr.length-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = currentMax;
            currentMax = Math.max(currentMax, temp);
        }

        // arr[arr.length - 1] = -1;
        return arr;
    }
}