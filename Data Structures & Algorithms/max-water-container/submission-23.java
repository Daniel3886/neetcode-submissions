// Time spend 13:12

class Solution {
    public int maxArea(int[] heights) {
        // Arrays.sort(heights);
        // System.out.println(Arrays.toString(heights));

        // int water = 0;
        // int lstIdx = 0;
        // int frstIdx = heights.length - 1; 
        // // int width = 0;
        // int width = (heights.length - 1) - heights[0];
        // int height = 0;
        // System.out.println("Width: " + width);

        // int firstMax = heights.length - 1;
        // int secondMax = heights.length - 2;
        // int thirdMax = heights.length - 3;

        // if(firstMax == secondMax){
        //     height = thirdMax;
        // } else{
        //     height = firstMax;
        // }
        
        int maxArea =0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int width = right - left;
            int currHeight = Math.min(heights[left], heights[right]);
            int area = currHeight * width;

            maxArea = Math.max(maxArea, area);
            
            if(heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

//Input: height = [1,7,2,5,4,7,3,6]
//Input: height = [1,2,3,4,5,6,7,7]
// Output: 36
 
// width  = 7 - 1 = 6 (last index - first index)
// height = min(7, 6) = 6
// water  = 6 × 6 = 36

// width = 7
// height = 6
// 7, 2, 5, 4, 7, 3, 6
// 6*7 = 42
// 2+5+4+6+3 = 20
// 42 - 20 = 22



// width = 3
// height = 2
// 2 * 3 = 6
// 6-2 = 4
