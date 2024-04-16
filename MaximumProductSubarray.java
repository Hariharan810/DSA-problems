
// GFG : https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1


public class MaximumProductSubarray {
    long maxProduct(int[] arr, int n) {
        // code here
        long prefixSum = 1;
        long suffixSum = 1;

        long ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            prefixSum *= arr[i];
            suffixSum *= arr[n-i-1];

            ans = Math.max(ans,Math.max(prefixSum,suffixSum));

            if(prefixSum == 0)prefixSum = 1;
            if(suffixSum == 0)suffixSum = 1;


        }

        return ans;
    }
}
