
// LeetCode: https://leetcode.com/problems/find-the-pivot-index/


public class FindThePivotInteger {
    public int pivotInteger(int n) {
        int totalSum = (n*(n+1))/2;
        int curSum=0;

        for(int i=n;i>=0;i--){

            curSum+=i;
            if(curSum==totalSum){
                return i;
            }
            totalSum-=i;

        }
        return -1;
    }
}
