
// GFG : https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

public class PalindromeString {
    int isPalindrome(String S) {

        char[] ch = S.toCharArray();

        int i = 0;
        int j = ch.length-1;

        while(i<j){

            if(ch[i]!=ch[j]){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
