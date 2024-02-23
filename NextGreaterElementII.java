
// LeetCode
// Problem Link : https://leetcode.com/problems/next-greater-element-ii/


import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;

        Stack<Integer> stack = new Stack<>();

        int[] result = new int[n];

        for(int i=n*2-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
                stack.pop();
            }

            if(i<n){

                if(!stack.isEmpty()){
                    result[i] = stack.peek();
                }
                else{
                    result[i]=-1;
                }
            }
            stack.push(nums[i%n]);
        }
        return result;
    }
}
