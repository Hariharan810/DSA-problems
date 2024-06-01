

// LeetCode : https://leetcode.com/problems/score-of-a-string/

public class ScoreOfAString {
    public int scoreOfString(String s) {

        int sum = 0;
        char[] ch = s.toCharArray();

        for(int i=0;i<s.length()-1;i++){
            sum += Math.abs((ch[i])-(ch[i+1]));
        }

        return sum;
    }
}
