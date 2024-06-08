
// LeetCode : https://leetcode.com/problems/continuous-subarray-sum/


import java.util.HashMap;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }

        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }

        return false;
    }
}
