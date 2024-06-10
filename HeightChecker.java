
// LeetCode : https://leetcode.com/problems/height-checker/

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        int expected[] = new int[n];
        for(int i=0; i<n; i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        for(int i=0; i<n; i++){
            if(heights[i] != expected[i]) count++;
        }
        return count;
    }
}
