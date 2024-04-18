
// LeetCode : https://leetcode.com/problems/island-perimeter/


public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

        int sum = 0;

        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    sum+=4;

                    if(i>0 && grid[i-1][j] == 1){
                        sum-=2;
                    }
                    if(j>0 && grid[i][j-1] == 1){
                        sum-=2;
                    }
                }
            }
        }
        return sum;
    }
}
