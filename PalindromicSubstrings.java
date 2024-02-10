
// LeetCOde
// Problem Link : https://leetcode.com/problems/palindromic-substrings/description/?envType=daily-question&envId=2024-02-10


public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++) {
            int even = palindromeCount(s, i, i+1);
            int odd = palindromeCount(s, i-1, i+1);
            ans += even + odd + 1;
        }
        return ans;
    }

    public int palindromeCount(String s, int left, int right) {
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}


// Brute force approach

//public int countSubstrings(String s) {
//
//    int count = 0;
//    for(int i=0;i<s.length();i++){
//        for(int j=i;j<s.length();j++){
//            boolean temp = checkPalindrame(s.substring(i,j+1));
//            if(temp){
//                count++;
//            }
//        }
//    }
//    return count;
//}
//
//public static boolean checkPalindrame(String s){
//
//    int i=0;
//    int j=s.length()-1;
//
//    while(i<j){
//        if(s.charAt(i)!=charAt(j)){
//            return false;
//        }
//        i++;
//        j--;
//    }
//    return true;
//}