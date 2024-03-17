
// LeetCode: https://leetcode.com/problems/merge-intervals/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        if (intervals.length == 0) return intervals;

        int[] merged = intervals[0];

        List<int[]> result = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];

            if (current[0] <= merged[1]) {
                merged = new int[]{
                        Math.min(merged[0], current[0]),
                        Math.max(merged[1], current[1])
                };
            }
            else {
                result.add(merged);
                merged = current;
            }
        }

        result.add(merged);
        return result.toArray(new int[0][2]);
    }
}
