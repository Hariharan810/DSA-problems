
// LeetCode
// Problem Link : https://leetcode.com/problems/minimum-window-substring/?envType=daily-question&envId=2024-02-04


import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        if(s.isEmpty() || t.isEmpty())return "";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int i=0,j=0;
        int left=0,right=0;
        int min=s.length();
        int required=t.length();
        boolean found=false;

        while(j<s.length()){
            char c1 = s.charAt(j++);
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)-1);
                if(map.get(c1)>=0)required-=1;
            }

            if(required>0)continue;

            while(required==0){
                char c2 = s.charAt(i++);
                if(map.containsKey(c2)){
                    map.put(c2,map.get(c2)+1);
                    if(map.get(c2)>0)required+=1;
                }
            }
            if((j-i)<min){
                left=i;
                right=j;
                min=j-i;
                found=true;
            }
        }
        return !found ? "" : s.substring(left-1,right);
    }
}
