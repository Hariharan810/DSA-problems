
// LeetCode : https://leetcode.com/problems/freedom-trail/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreedomTrail {
    private Map<Character, List<Integer>> charToIndex = new HashMap<>();
    private int[][] memo;
    private int m, n;

    public int findRotateSteps(String ring, String key) {
        this.m = ring.length();
        this.n = key.length();
        memo = new int[m][n];

        for(int i = 0; i < m; i++) {
            char c = ring.charAt(i);

            charToIndex.putIfAbsent(c, new ArrayList<>());
            charToIndex.get(c).add(i);
        }

        return dp(ring, 0, key, 0);
    }

    private int dp(String ring, int i, String key, int j) {
        if(j == n) {
            return 0;
        }

        if(memo[i][j] != 0) {
            return memo[i][j];
        }

        int res = Integer.MAX_VALUE;

        for(int k: charToIndex.get(key.charAt(j))) {
            int diff = Math.abs(k - i);

            diff = Math.min(diff, m - diff);

            int subProblem = dp(ring, k, key, j + 1);

            res = Math.min(res, diff + 1 + subProblem);
        }

        memo[i][j] = res;

        return memo[i][j];
    }
}
