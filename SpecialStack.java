
//geeksForGeeks: https://practice.geeksforgeeks.org/problems/special-stack/1


import java.util.Stack;

public class SpecialStack {
    public void push(int a, Stack<Integer> s)
    {
        s.push(a);
    }
    public int pop(Stack<Integer> s)
    {
        if(s.isEmpty())return -1;
        return s.pop();
    }
    public int min(Stack<Integer> s)
    {
        if(s.isEmpty())return Integer.MAX_VALUE;
        int num = s.pop();
        int ans = min(s);
        return Math.min(num,ans);
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        if(s.size()>=n)return true;
        return false;
    }
    public boolean isEmpty(Stack<Integer>s)
    {
        if(s.size()==0)return true;
        return false;
    }
}
