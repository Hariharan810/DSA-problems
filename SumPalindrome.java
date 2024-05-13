
// GFG : https://practice.geeksforgeeks.org/problems/sum-of-digit-is-palindrome-or-not/0

public class SumPalindrome {
    static long isSumPalindrome(long n){
        for(int i = 0; i <= 5; i++){
            long reverseNum = 0, rem = 0, originalNum = n;
            while(n > 0){
                rem = n % 10;
                reverseNum = reverseNum * 10 + rem;
                n = n/10;
            }

            if(originalNum == reverseNum){
                return reverseNum;
            }

            n = originalNum + reverseNum;
        }
        return -1;
    }
}
