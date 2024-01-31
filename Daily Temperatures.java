//LeetCode
//Problem Link : https://leetcode.com/problems/daily-temperatures/description/?envType=daily-question&envId=2024-01-31

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n=temperatures.length;
        int[] days = new int[n];
        
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                days[i]= stack.peek()-i;
            }

            stack.push(i);
        }
        return days;
    }
}
