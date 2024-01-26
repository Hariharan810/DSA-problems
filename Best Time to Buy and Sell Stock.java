//LeetCode
//Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int minValue=Integer.MAX_VALUE;
        int maxValue=0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minValue){
                minValue=prices[i];
            }
            else{
                int profit=prices[i]-minValue;
                maxValue=Math.max(maxValue,profit);
            }
        }
        return maxValue;
    }
}
