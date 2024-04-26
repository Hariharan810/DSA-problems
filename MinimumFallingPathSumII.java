
// LeetCode : https://leetcode.com/problems/minimum-falling-path-sum-ii/


public class MinimumFallingPathSumII {
    public int minFallingPathSum(int[][] grid) {
        for(int i = 1;i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                int val =  getMin(grid,i-1,j);
                if(j == 0){
                    grid[i][j] += val;
                }
                else if(j == grid.length-1){
                    grid[i][j] += val;
                }
                else{
                    grid[i][j] += val;
                }
            }
        }


        return getMin(grid,grid.length-1,-1);
    }
    public int getMin(int[][] grid,int row,int col){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < grid.length; i++){
            if(col != i){
                min = Math.min(grid[row][i],min);
            }
        }
        return min;
    }
}
