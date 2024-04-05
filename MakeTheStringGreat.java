
//LeetCode: https://leetcode.com/problems/make-the-string-great/

import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(!stack.isEmpty() && Math.abs(stack.peek()-ch)==32){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
