
// LeetCode
// Problem Link : https://leetcode.com/problems/bag-of-tokens/?envType=daily-question&envId=2024-03-04



import java.util.Arrays;

public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);

        int left = 0;
        int right = tokens.length-1;
        int curScore = 0;
        int maxScore = 0;

        while(left<=right){

            if(tokens[left]<=power){
                power-=tokens[left];
                curScore++;
                maxScore=Math.max(curScore,maxScore);
                left++;
            }
            else if(curScore>=1){
                power+=tokens[right];
                curScore--;
                right--;
            }
            else{
                break;
            }
        }
        return maxScore;
    }
}
