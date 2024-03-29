
// LeetCode: https://leetcode.com/problems/count-number-of-nice-subarrays/


public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {
    public long countSubarrays(int[] nums, int k) {

        long result = 0;

        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }

        int start = 0, end = 0;
        int count = 0;

        while(end < nums.length){

            if(nums[end] == max){
                count++;
            }

            if(count >= k){
                while(count >= k){
                    result += nums.length - end;

                    if(nums[start] == max){
                        count--;
                    }

                    start++;
                }
            }

            end++;
        }
        return result;
    }
}
