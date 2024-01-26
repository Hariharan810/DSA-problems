//LeetCode
//Problem Link : https://leetcode.com/problems/out-of-boundary-paths/?envType=daily-question&envId=2024-01-26

class Solution {
    private static final int MOD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return findMoves(m, n, maxMove, startRow, startColumn, dp);
    }

    public static int findMoves(int m, int n, int maxMove, int row, int col, int[][][] dp) {
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 1;
        }

        if (maxMove == 0) {
            return 0;
        }

        if (dp[row][col][maxMove] != -1) {
            return dp[row][col][maxMove];
        }

        long ans = 0;
        ans += findMoves(m, n, maxMove - 1, row - 1, col, dp) % MOD;
        ans += findMoves(m, n, maxMove - 1, row + 1, col, dp) % MOD;
        ans += findMoves(m, n, maxMove - 1, row, col - 1, dp) % MOD;
        ans += findMoves(m, n, maxMove - 1, row, col + 1, dp) % MOD;

        dp[row][col][maxMove] = (int) (ans % MOD);
        return dp[row][col][maxMove];
    }
}
