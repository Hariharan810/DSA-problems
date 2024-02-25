
// LeetCode
// Problem Link : https://leetcode.com/problems/largest-rectangle-in-histogram/



import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;

        Stack<Integer> stack = new Stack<>();

        int[] left =new int[n];
        int[] right = new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                left[i]=0;
            }
            else{
                left[i]=stack.peek()+1;
            }
            stack.push(i);
        }

        while(!stack.isEmpty())stack.pop();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i]=n-1;
            }
            else{
                right[i]=stack.peek()-1;
            }
            stack.push(i);
        }

        int max = 0;

        for(int i=0;i<n;i++){
            max = Math.max(max,heights[i]*(right[i]-left[i]+1));
        }
        return max;
    }
}
