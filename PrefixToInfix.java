
// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/prefix-to-infix_1215000


import java.util.Stack;

public class PrefixToInfix {

    public static String prefixToInfixConversion(String exp) {

        Stack<String> stack = new Stack<>();

        for(int i=exp.length()-1;i>=0;i--){

            char ch = exp.charAt(i);

            if(!isOperator(ch)){
                stack.push(String.valueOf(ch));
            }
            else{

                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String sunExpression = "("+operand1+ch+operand2+")";

                stack.push(sunExpression);
            }

        }
        return stack.pop();
    }
    private static boolean isOperator(char ch){
        return ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^';
    }
}
