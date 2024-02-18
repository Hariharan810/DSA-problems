
// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/stack-implementation-using-array_3210209


public class StackImplementationUsingArray {

    static class Stack {
        int[] stack;
        int top;
        Stack(int capacity) {
            // Write your code here.
            stack = new int[capacity];
            top =-1;
        }
        public void push(int num) {
            // Write your code here.
            if(top == stack.length-1){
                return;
            }
            top += 1;
            stack[top]=num;
            return;
        }
        public int pop() {
            // Write your code here.
            if(top == -1){
                return -1;
            }
            int result = stack[top];
            top-=1;
            return result;
        }
        public int top() {
            // Write your code here.
            if(top==-1)return -1;
            return stack[top];
        }
        public int isEmpty() {
            // Write your code here.
            if(top == -1){
                return 1;
            }
            return 0;
        }
        public int isFull() {
            // Write your code here.
            if(top == stack.length-1){
                return 1;
            }
            return 0;
        }
    }
}
