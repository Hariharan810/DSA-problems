
// LeetCode : https://leetcode.com/problems/score-after-flipping-matrix/?envType=daily-question&envId=2024-05-13


public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){

            if(grid[i][0] == 0){
                for(int j=0;j<m;j++){
                    grid[i][j] ^= 1;
                }
            }
        }

        for(int j=1;j<m;j++){
            int colCount = 0;

            for(int i=0;i<n;i++){
                colCount += grid[i][j];
            }

            if(colCount < n-colCount){
                for(int i=0;i<n;i++){
                    grid[i][j] ^= 1;
                }
            }
        }

        int result = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result += grid[i][j] * (1 << (m-1-j));
            }
        }

        return result;
    }
}
