
// LeetCode: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/


public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        int openParenthesesCount = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                openParenthesesCount++;
            else if (arr[i] == ')') {
                if (openParenthesesCount == 0)
                    arr[i] = '*';
                else
                    openParenthesesCount--;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (openParenthesesCount > 0 && arr[i] == '(') {
                arr[i] = '*';
                openParenthesesCount--;
            }
        }

        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*')
                arr[p++] = arr[i];
        }

        return new String(arr, 0, p);
    }
}
