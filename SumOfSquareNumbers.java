
// LeetCode : https://leetcode.com/problems/sum-of-square-numbers/?envType=daily-question&envId=2024-06-17


public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {

        int b = (int)Math.sqrt(c);
        int a = 0;

        while(a<=b){
            long res = (long)a*a + (long)b*b;

            if(res == c){
                return true;
            }
            else if(res < c){
                a++;
            }
            else{
                b--;
            }
        }

        return false;
    }
}
