
// LeetCode : https://leetcode.com/problems/maximum-score-from-removing-substrings/


import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings {
    public int maximumGain(String s, int x, int y) {
        if(x > y){
            return helper(s,'a','b',x,y);
        }
        else{
            return helper(s,'b','a',y,x);
        }
    }

    public static int helper(String s,char higherChar,char lowerChar,
                             int higherValue,int lowerValue){

        Stack<Character> stack = new Stack<>();
        int maxPoints = 0;

        for(Character ch : s.toCharArray()){

            if(!stack.isEmpty() && stack.peek() == higherChar && ch == lowerChar){
                stack.pop();
                maxPoints += higherValue;
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder remaining = new StringBuilder();
        while(!stack.isEmpty()){
            remaining.append(stack.pop());
        }
        remaining.reverse();

        for(Character ch : remaining.toString().toCharArray()){

            if(!stack.isEmpty() && stack.peek() == lowerChar && ch == higherChar){
                stack.pop();
                maxPoints += lowerValue;
            }
            else{
                stack.push(ch);
            }
        }

        return maxPoints;
    }
}
