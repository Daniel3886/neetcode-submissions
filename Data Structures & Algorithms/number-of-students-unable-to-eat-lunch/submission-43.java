class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int count = 0;

        int n = students.length;
        int[] arr = new int[2];

        for(int i = 0; i < n; i++){
            arr[students[i]]++; 
            count++;
        }

        // 0 - 0,0 
        // 1 - 1,1

        // arr -> 1,1,0,1
        for(int sandwich : sandwiches){ // 0,0,1,1
            if(arr[sandwich] > 0){ // 
                arr[sandwich]--;
                count--;
            } else {
                break;
            }
    

            // count++;
        }


        return count;
    }
}