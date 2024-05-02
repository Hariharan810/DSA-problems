
// LeetCode : https://leetcode.com/problems/largest-number-that-can-be-formed-by-concatenating-digits/

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            for(int j=nums.length-1;j>=0;j--){

                if(nums[j] == -nums[i]){
                    return nums[j];
                }
            }
        }

        return -1;
    }
}
