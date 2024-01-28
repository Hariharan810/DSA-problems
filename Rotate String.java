//LeetCode
//Problem Link :  https://leetcode.com/problems/rotate-string/

class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length()) return false;

        return (s+s).indexOf(goal)>=0;
        
    }
}
