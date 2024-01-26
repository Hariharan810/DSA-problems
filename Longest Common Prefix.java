//LeetCode
//Problem Link : https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0){
            return " ";
        }
        
        String lcp=strs[0];

        for(int i=1;i<strs.length;i++){

            String current=strs[i];
            int j=0;
            
            while(j<lcp.length() && j<current.length()){
                if(lcp.charAt(j)==current.charAt(j)){
                    j++;
                }
                else{
                    break;
                }
            }
            lcp=lcp.substring(0,j);
        }
        return lcp;
    }
}


//Approach 2

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String s1=strs[0];
        String s2=strs[strs.length-1];

        int index=0;

        while (index < s1.length() && index < s2.length()){
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,index);
    }
}
