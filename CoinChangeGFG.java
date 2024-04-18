
// GFG : https://practice.geeksforgeeks.org/problems/coin-change2448/1


public class CoinChangeGFG {
    public long count(int coins[], int N, int sum) {
        long[] dp = new long[sum+1];
        dp[0] = 1;

        for(int i=0;i<N;i++){
            for(int j=1;j<sum+1;j++){
                int coinValue = coins[i];

                if(j-coinValue>=0){
                    dp[j] = dp[j] + dp[j-coinValue];
                }
            }
        }
        return dp[sum];
    }
}
