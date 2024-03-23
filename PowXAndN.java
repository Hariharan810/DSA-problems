
// LeetCode: https://leetcode.com/problems/powx-n/


public class PowXAndN {
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1.0;
        }

        long num = n;
        if (num < 0) {
            num = -num;
            x = 1 / x;
        }

        return powHelper(x, num);
    }

    private double powHelper(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = powHelper(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}
