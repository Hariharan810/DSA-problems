
// LeetCode: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/

import java.util.HashMap;

public class LengthOfLongestSubarrayWithAtMostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int ans = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        while (right < n) {

            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while (left <= right && freq.get(nums[right]) > k) {

                freq.put(nums[left], freq.get(nums[left]) - 1);

                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }
            ans = Math.max(ans, (right - left) + 1);
            right++;
        }

        return ans;
    }
}
