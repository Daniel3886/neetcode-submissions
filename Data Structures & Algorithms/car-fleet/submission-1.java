class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // storing both speed and position at a single array 
        int[][] pair = new int[position.length][2]; 
        // basically (position, speed) = [(10,2), (8,4), (0,1), (5,1), (3,3)]
        for(int i = 0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0])); // sorting the speed and position in the same array
        // so (position, speed) = [(0,1), (3,3), (5,1), (8,4), (10,2)]
        Stack<Double> stack = new Stack<>();
        for(int[] p : pair){ 
            // calculating time = target - position/speed 
            stack.push((double) (target - p[0])/p[1]);
            // if there're 2 elements in a stack and the new cars time is less or equal to the time before it its a fleet and we can pop it from the stack
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)){
                stack.pop();
            }
        }

        return stack.size();
    }
}