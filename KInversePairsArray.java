//LeetCode
//Problem Link : https://leetcode.com/problems/k-inverse-pairs-array/?envType=daily-question&envId=2024-01-27

class KInversePairsArray {
    private static Integer[][] dp = new Integer[1001][1001];

    public int kInversePairs(int n, int k) {
         
        if(n==0){
            return 0;
        }
        if(k==0){
            return 1;
        }

        if(dp[n][k]!=null){
            return dp[n][k];
        }

        int count=0;

        for(int i=0;i<=Math.min(n-1,k);i++){
            count=(count+kInversePairs(n-1,k-i))%1000000007;
        }

        dp[n][k]=count;

        return dp[n][k];
    }
}
