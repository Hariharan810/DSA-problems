
// LeetCode : https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1


import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public boolean findTriplets(int arr[] , int n)
    {
        //add code here.

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0)
                    return true;
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }

        return false;
    }
}
