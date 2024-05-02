
// GFG : https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

public class RowWithMax1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here

        int minCount = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1, count = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[i][mid] == 1) {
                    count = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (count < minCount && count >= 0) {
                minCount = count;
                index = i;
            }
        }
        return index;
    }
}
