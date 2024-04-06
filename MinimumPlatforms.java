
// GFG: https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

import java.util.Arrays;

public class MinimumPlatforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int c = 1;
        int j = 0;

        for(int i = 1 ; i < n ;i++)
        {
            if(dep[j] < arr[i]) j++;

            else if(dep[j] >= arr[i])
                c++;
        }
        return c;
    }
}
