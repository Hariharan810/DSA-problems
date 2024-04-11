
// GFG: https://leetcode.com/problems/minimize-the-sum-of-product/


import java.util.Arrays;

public class MinimizeTheSumOfProduct {

    public long minValue(long a[], long b[], long n) {

        Arrays.sort(a);

        Arrays.sort(b);

        long result = 0;

        for(int i = 0; i < a.length; i++) {
            result += a[i] * b[(int)n-i-1];
        }
        return result;
    }
}
