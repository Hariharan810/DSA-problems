

// GFG : https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

public class PowerOfNumbers {
    long power(int N,int R)
    {
        long div=1000000007;
        if(R==0){
            return 1;
        }
        if(R%2==0){
            long value=power(N,R/2);
            return (value*value)%div;
        }
        else{
            long value=power(N,R-1);
            return (value*N)%div;
        }

    }
}
