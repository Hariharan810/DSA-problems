// LeetCode
// Problem Link : https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/?envType=daily-question&envId=2024-02-01

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int [][] ans = new int[nums.length/3][3];
        for(int i = 2; i < nums.length; i += 3){
            if(nums[i] - nums[i-2] > k) return new int[0][];
            ans[i/3] = new int[]{nums[i-2], nums[i-1],nums[i]};
        }
        return ans;
    }
}

//class Solution {
//    public int[][] divideArray(int[] nums, int k) {
//
//        int size = nums.length;
//
//        int[][] result = new int[0][0];
//
//        if (size % 3 != 0) {
//            return new int[0][0];
//        }
//
//        for (int i = 0; i < size; i += 3) {
//
//            if (i + 2 < size && nums[i + 2] + nums[i] <= k) {
//                int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
//                result = Arrays.copyOf(result, result.length + 1);
//                result[result.length - 1] = triplet;
//            } else {
//                return new int[0][0];
//            }
//        }
//        return result;
//    }
//}