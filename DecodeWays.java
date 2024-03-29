
// LeetCode
// Problem Link : https://leetcode.com/problems/decode-ways/



import java.util.Arrays;

class DecodeWays {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return decode(s,0,dp);
    }
    private int decode(String s,int i,int[] dp){
        int n=s.length();
        if(i==n){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int count=decode(s,i+1,dp);
        if(i<n-1 && ((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0'))<27){
            count+=decode(s,i+2,dp);
        }
        return dp[i]=count;
    }
}
