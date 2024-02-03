
// LeetCode
// Problem Link : https://leetcode.com/problems/partition-array-for-maximum-sum/?envType=daily-question&envId=2024-02-03

import java.util.Arrays;

public class PartitionArrayForMaximumSum {
    public static void main(String[] args) {
        int[] arr={1,15,7,9,2,5,10};
        int k=3;
        System.out.println(maxSumAfterPartitioning(arr,k));
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {

        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return findMaxSum(0,arr,k,dp);
    }
    public static int findMaxSum(int ind,int[] arr,int k,int[] dp){

        int n=arr.length;
        if(ind==n)return 0;

        if(dp[ind]!=-1)return dp[ind];

        int len=0;
        int max=Integer.MIN_VALUE;
        int maxSum=Integer.MIN_VALUE;

        for(int i=ind;i<Math.min(ind+k,n);i++){

            len++;
            max=Math.max(max,arr[i]);

            int sum = len*max + findMaxSum(i+1,arr,k,dp);

            maxSum=Math.max(maxSum,sum);
        }
        return dp[ind]=maxSum;
    }
}
