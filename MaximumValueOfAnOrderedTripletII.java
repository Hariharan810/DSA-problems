
// LeetCode: https://leetcode.com/problems/maximum-value-of-an-ordered-triplet/


public class MaximumValueOfAnOrderedTripletII {

    public long maximumTripletValue(int[] nums) {

        int[] maxLeft = new int[nums.length];
        int[] maxRight = new int[nums.length];
        long result = 0;

        maxLeft[0] = nums[0];
        maxRight[nums.length-1] = nums[nums.length-1];

        for(int i=1;i<nums.length;i++){
            maxLeft[i] = Math.max(nums[i],maxLeft[i-1]);
        }

        for(int i=nums.length-2;i>=0;i--){
            maxRight[i] = Math.max(nums[i],maxRight[i+1]);
        }

        for(int i=1;i<nums.length-1;i++){
            long temp = (long)(maxLeft[i-1]-nums[i])*maxRight[i+1];
            result = Math.max(result,temp);
        }

        return result;
    }
}
