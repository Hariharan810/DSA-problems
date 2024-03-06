
//GeeksForGeeks: https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1


import java.util.Stack;

public class StockSpanProblem {
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && price[i]>=price[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=i+1;
            }
            else{
                result[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}
