

// LeetCode
// problem Link : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/?envType=daily-question&envId=2024-02-13


public class FindFirstPalindromicStringInTheArray {

    public String firstPalindrome(String[] words) {

        for(int i=0;i<words.length;i++){
            String str = words[i];
            if(findPalindron(str)){
                return str;
            }
        }
        return new String("");

    }

    public static boolean findPalindron(String s){
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;

            start++;
            end--;
        }
        return true;
    }
}
