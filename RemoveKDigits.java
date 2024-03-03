
// LeetCode
// Problem Link : https://leetcode.com/problems/remove-k-digits/



import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder result = new StringBuilder();
        if (k >= num.length()) {
            return "0";
        }

        if ( k == 0) {
            return num;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i< num.length(); i++) {
            char val = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() > val) {
                stack.pop();
                k--;
            }

            if (val != '0') {
                stack.add(val);
            } else if (!stack.isEmpty()) {
                stack.add(val);
            }

        }

        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        if (stack.isEmpty()) {
            return "0";
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();

    }
}
