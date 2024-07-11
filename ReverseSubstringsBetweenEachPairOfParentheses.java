
// LeetCode : https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/


import java.util.Stack;

public class ReverseSubstringsBetweenEachPairOfParentheses {

    public String reverseParentheses(String s) {
        Stack<Integer> match = new Stack<>();
        int n = s.length();

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) == '(') {
                match.push(i);
            } else if (sb.charAt(i) == ')') {
                int start = match.pop();
                reverse(sb, start, i);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = sb.charAt(i);
            if (c != '(' && c != ')') {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
