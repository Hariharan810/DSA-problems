
// GFG : https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1


import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        Arrays.sort(arr);

        int cnt = 1, count = 1, a;
        for (int i = 0; i < N - 1; i++) {
            a = arr[i];
            if (a + 1 == arr[i + 1]) {
                cnt++;
            } else if (a == arr[i + 1]) {
                continue;
            } else {
                cnt = 1;
            }
            count = Math.max(count, cnt);
        }
        return count;
    }
}
