
// LeetCode : https://leetcode.com/problems/maximum-total-importance-of-roads/


import java.util.Arrays;

public class MaximumTotalImportanceOfRoads {
    public long maximumImportance(int n, int[][] roads) {
        long res = 0, cost = 1;
        long[] conn = new long[n];
        for (int[] road : roads) {
            conn[road[0]]++;
            conn[road[1]]++;
        }
        Arrays.sort(conn);
        for (long con : conn) {
            res += con * (cost++);
        }
        return res;
    }
}
