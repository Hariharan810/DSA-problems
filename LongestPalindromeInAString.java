

// GFG : https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1

public class LongestPalindromeInAString {
    static String longestPalin(String s){
        // code here
        if (s.length() <= 1) return s;

        String lps = String.valueOf(s.charAt(0));

        for (int i = 1; i < s.length(); i++){

            String s1 = palindrome(s, i, i);

            if (s1.length() > lps.length()) lps = s1;

            s1 = palindrome(s, i - 1, i);

            if (s1.length() > lps.length()) lps = s1;
        }

        return lps;
    }

    static String palindrome(String str, int i, int j){
        while (str.charAt(i) == str.charAt(j)){
            i--;
            j++;

            if (i == -1 || j == str.length()) break;
        }
        return str.substring(i + 1, j);
    }
}
