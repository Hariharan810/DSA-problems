
// LeetCode : https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together/


public class MinimumSwapsToGroupAll1sTogetherII {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;

        for (int num : nums) {
            totalOnes += num;
        }

        if (totalOnes == 0 || totalOnes == n) return 0;

        int currentOnes = 0;

        for (int i = 0; i < totalOnes; i++) {
            currentOnes += nums[i];
        }

        int maxOnes = currentOnes;

        for (int i = 0; i < n; i++) {
            currentOnes -= nums[i];
            currentOnes += nums[(i + totalOnes) % n];
            maxOnes = Math.max(maxOnes, currentOnes);
        }

        return totalOnes - maxOnes;
    }
}
