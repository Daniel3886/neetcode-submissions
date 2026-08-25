class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count = 0;

        int[] arr = new int[2];

        for(int val : students){
            arr[val]++;
            count++;
        }

        for(int val : sandwiches){
            if(arr[val] > 0){
                arr[val]--;
                count--;
            } else {
                break;
            }
        }

        return count;
    }
}