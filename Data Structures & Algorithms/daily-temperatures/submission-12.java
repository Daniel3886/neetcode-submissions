class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() 
            && temperatures[i] > temperatures[stack.peek()]){
                int top = stack.pop();
                result[top] = i - top;
            }

            stack.push(i);
        }

        return result;
    }
}

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         Stack<Integer> stack = new Stack<>();
//         int[] result = new int[temperatures.length];

//         for(int i = 0; i < temperatures.length; i++){

//             while(!stack.isEmpty() 
//             && temperatures[i] > temperatures[stack.peek()]){
                
//                 int top = stack.pop();
//                 result[top] = i - top;
//             }
//             // System.out.println("Stack: "+ stack);
//             stack.push(i);
//         }

//         return result;
//     }
// }



// i = 0
// 30

// check if the next day is larger than 30
// true -> count++
//false > check another day
