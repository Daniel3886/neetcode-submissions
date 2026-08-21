class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Queue<Integer> queueStudents = new LinkedList<>();
        // Queue<Integer> queueSandwiches = new LinkedList<>();
        // int count = 0;
        
        int n = students.length;
        int res = n;
        int[] count = new int[2];

        for(int i = 0; i < n; i++){
            count[students[i]]++;
        }

        for(int i = 0; i < n; i++){
            if(count[sandwiches[i]] > 0){
                res--;
                count[sandwiches[i]]--;
            } else {
                break;
            }
        }


        return res;
    }
}