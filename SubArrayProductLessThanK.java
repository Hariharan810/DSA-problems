
// LeetCode: https://leetcode.com/problems/subarray-product-less-than-k/


public class SubArrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1)return 0;

        int count = 0;

        int start = 0;
        int end = 0;
        int product = 1;

        while(end < nums.length){

            product *= nums[end];

            while(start < nums.length && product>=k){

                product /= nums[start];
                start++;
            }

            if(product<k){
                count += (end - start)+1;
            }
            end++;
        }
        return count;
    }
}
