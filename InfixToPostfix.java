
// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/day-23-:-infix-to-postfix-_1382146



import java.util.Stack;

public class InfixToPostfix {

    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && prec(ch) <= prec(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid";
            }
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
