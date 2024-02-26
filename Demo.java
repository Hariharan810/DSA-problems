import java.util.*;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        int[] a={4, 7, 8, 2, 3, 1};

        int n = a.length;

        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int cur = a[i];
            while (!stack.isEmpty() && stack.peek() >= cur) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                a[i]=stack.peek();
            } else {
                a[i]=-1;
            }

            stack.push(cur);
        }
        System.out.println(Arrays.toString(a));
    }
}
