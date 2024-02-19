
// LeetCode
// problem Link : https://leetcode.com/problems/min-stack/

import java.util.Stack;

public class MinStack {

    class MinStack1 {

        Stack<Integer> stack;
        int min;

        public MinStack1() {

            stack = new Stack<>();
            min = Integer.MAX_VALUE;

        }

        public void push(int val) {

            if(val<=min){
                stack.push(min);
                min = val;
            }
            stack.push(val);
        }

        public void pop() {

            if(!stack.isEmpty() && stack.pop()==min){

                min=stack.pop();
            }
        }

        public int top() {

            if(!stack.isEmpty())return stack.peek();
            return -1;
        }

        public int getMin() {
            return min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
