class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor != color){
            dfs(originalColor, image, sr, sc, color);
        }

        return image;
    }

    private static void dfs(
        int originalColor,
        int[][] image,
        int r,
        int c,
        int newColor
    ){
      if(r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != originalColor){
        return;
      }  
        image[r][c] = newColor;

        dfs(originalColor, image, r+1, c, newColor);
        dfs(originalColor, image, r-1, c, newColor);
        dfs(originalColor, image, r, c+1, newColor);
        dfs(originalColor, image, r, c-1, newColor);
    }

}