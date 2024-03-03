
// LeetCode
// Problem Link : https://leetcode.com/problems/maximal-rectangle/


import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        return maximalSubMatrixRectangle(matrix,matrix.length,matrix[0].length);
    }
    public int maximalSubMatrixRectangle(char[][] matrix,int n,int m){

        int maxArea = 0;
        int[] height = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }
                else{
                    height[j]=0;
                }
            }
            int area = findArea(height);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }

    public int findArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, width * height);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
