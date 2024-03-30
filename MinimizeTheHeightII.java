
// GFG Link: https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1


import java.util.Arrays;

public class MinimizeTheHeightII {
    int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort(arr);

        int result = arr[n-1] - arr[0];

        int min = arr[0]+k;
        int max = arr[n-1]-k;

        for(int i = 1; i < n; i++){

            if(arr[i]-k < 0){
                continue;
            }

            int tempMin = Math.min(min,arr[i]-k);
            int tempMax = Math.max(max,arr[i-1]+k);

            result = Math.min(result,tempMax-tempMin);
        }

        return result;
    }
}
