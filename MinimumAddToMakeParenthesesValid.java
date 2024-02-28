
// LeetCode
// Problem Link : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/



import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {

    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();


        for(char ch : s.toCharArray()){

            if(ch == '('){
                stack.push(ch);
            }
            else{
                if(stack.size()>0 && stack.peek()=='('){
                    stack.push('(');
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
