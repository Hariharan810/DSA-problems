
// LeetCode : https://leetcode.com/problems/longest-palindrome/


import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {

        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){

            if(set.contains(ch)){
                count += 2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }

        if(!set.isEmpty()){
            count += 1;
        }

        return count;
    }
}
