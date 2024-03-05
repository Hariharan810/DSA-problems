
//GeeksForGeeks: https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1


import java.util.Stack;

public class ParenthesisChecker {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<x.length();i++){

            char ch = x.charAt(i);

            if(x.charAt(i)=='('||x.charAt(i)=='{'||x.charAt(i)=='['){
                stack.push(ch);
            }
            else if(!stack.isEmpty() && stack.peek()=='{' && ch=='}'){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek()=='(' && ch==')'){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek()=='[' && ch==']'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
