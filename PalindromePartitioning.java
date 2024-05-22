
// LeetCode : https://leetcode.com/problems/palindrome-partitioning/

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        List<String> tempList = new ArrayList<>();

        helper(s,0,tempList,result);
        return result;
    }

    public static void helper(String s, int start, List<String> tempList,
                              List<List<String>> result){

        if(start == s.length()){
            result.add(new ArrayList<>(tempList));
            return;
        }

        for(int end = start+1;end<=s.length();end++){

            if(isPalindrome(s,start,end-1)){
                tempList.add(s.substring(start,end));
                helper(s,end,tempList,result);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s,int left,int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
