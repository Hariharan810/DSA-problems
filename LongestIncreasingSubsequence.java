
// GFG : https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1


public class LongestIncreasingSubsequence {
    static int longestSubsequence(int size, int a[]) {
        if (size == 0) return 0;
        int[] tail = new int[size];
        int len = 1;
        tail[0] = a[0];

        for (int i = 1; i < size; i++) {
            if (a[i] > tail[len - 1]) {
                tail[len] = a[i];
                len++;
            } else {
                int c = ceilIdx(tail, 0, len - 1, a[i]);
                tail[c] = a[i];
            }
        }
        return len;
    }

    static int ceilIdx(int[] tail, int l, int h, int x) {
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (tail[mid] >= x) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return h;
    }
}
