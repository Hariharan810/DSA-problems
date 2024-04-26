
// GFG : https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1

import java.util.Arrays;

public class TripletSumInArray {
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here

        Arrays.sort(A);

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int sum = A[i] + A[start] + A[end];

                if (sum == X) {
                    return true;
                } else if (sum < X) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return false;
    }
}
