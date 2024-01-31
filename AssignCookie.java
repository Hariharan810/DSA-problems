// LeetCode : https://leetcode.com/problems/assign-cookies/

import java.util.Arrays;

class AssignCookie{
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int result=0;
        int childInx=g.length-1;
        int cookieInx=s.length-1;

        while(childInx >=0 && cookieInx >=0){
            if(s[cookieInx]>=g[childInx]){
                result++;
                cookieInx--;
            }
            childInx--;
        }
        return result;
    }
}
