
// LeetCode : https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/


import java.util.Stack;

public class MinimumDeletionsToMakeStringBalanced {
    public int minimumDeletions(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                stack.push(c);
            } else if (!stack.isEmpty() && stack.peek() == 'b') {
                count++;
                stack.pop();
            }
        }

        return count;
    }
}
