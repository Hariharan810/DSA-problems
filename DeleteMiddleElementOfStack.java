
// GeeksForGeeks: https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1


import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public void deleteMid(Stack<Integer> s, int sizeOfStack){
        // code here
        Stack<Integer> stack = new Stack<>();

        int mid = sizeOfStack/2;

        for(int i=1;i<mid+1;i++){
            stack.push(s.pop());
        }
        s.pop();
        while(!stack.isEmpty()){
            s.push(stack.pop());
        }
    }
}
