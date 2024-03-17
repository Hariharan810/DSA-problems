
// LeetCode: https://leetcode.com/problems/insert-interval/



import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int cur = 0;

        while(cur < intervals.length && intervals[cur][1] < newInterval[0]){
            result.add(intervals[cur]);
            cur++;
        }

        while(cur < intervals.length && intervals[cur][0] <= newInterval[1]){

            newInterval[0] = Math.min(intervals[cur][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[cur][1],newInterval[1]);
            cur++;
        }

        result.add(newInterval);

        while(cur < intervals.length){
            result.add(intervals[cur]);
            cur++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
