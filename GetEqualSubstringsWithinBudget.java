
// LeetCode : https://leetcode.com/problems/get-equal-substrings-within-budget/


public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int window  = 0;
        int left = 0;

        for(int right=0;right<s.length();right++){

            window += Math.abs(s.charAt(right) - t.charAt(right));

            while(window > maxCost){

                window -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
