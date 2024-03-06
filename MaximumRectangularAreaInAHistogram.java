
//GeeksForGeeks : https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1


import java.util.Stack;

public class MaximumRectangularAreaInAHistogram {
    public static long getMaxArea(long hist[], long n){
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        long[] left = new long[(int)n];
        long[] right = new long[(int)n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && hist[i]<=hist[stack.peek()]){
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
        for(int i=(int)n-1;i>=0;i--){
            while(!stack.isEmpty() && hist[i]<=hist[stack.peek()]){
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
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea,hist[i]*(right[i]-left[i]+1));
        }
        return maxArea;
    }
}
