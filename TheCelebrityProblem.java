
// LeetCode : https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1


import java.util.Stack;

public class TheCelebrityProblem {
    int celebrity(int M[][], int n)
    {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++)stack.push(i);

        while(stack.size()>=2){
            int person1 = stack.pop();
            int person2 = stack.pop();

            if(M[person1][person2]==1){
                stack.push(person2);
            }
            else{
                stack.push(person1);
            }
        }

        int celebrity = stack.pop();

        for(int i=0;i<n;i++){

            if(celebrity!=i && M[i][celebrity]==0 || M[celebrity][i]==1){
                return -1;
            }
        }
        return celebrity;
    }
}
