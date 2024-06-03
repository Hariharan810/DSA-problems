

// LeetCode : https://leetcode.com/problems/minimum-number-of-operations-to-make-string-t-an-anagram-of-string-s/

public class AppendCharactersToStringToMakeSubsequence {

    public int appendCharacters(String s, String t) {

        int count = 0;
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i)==t.charAt(j)){
                count++;
                j++;
            }
            i++;
        }

        return t.length()-count;
    }
}
