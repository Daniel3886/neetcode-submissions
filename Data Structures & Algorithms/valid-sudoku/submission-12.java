class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){

                char value = board[r][c];
                if(value == '.') continue;

                int boxIndex = (r / 3) * 3 + (c / 3);

                if(boxes[boxIndex].contains(value)){
                    System.out.println("Value: " + value);
                    return false;
                }

                if(rows[r].contains(value)){
                    return false;
                }

                if(cols[c].contains(value)){
                    return false;
                }                
                
                rows[r].add(value);
                cols[c].add(value);
                boxes[boxIndex].add(value);
            }
        }

        return true;
    }
}
