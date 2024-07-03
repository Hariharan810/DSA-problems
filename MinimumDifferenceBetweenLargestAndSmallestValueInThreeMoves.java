
// LeetCode : https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/


import java.util.Arrays;

public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length;

        int option1 = nums[n - 1] - nums[3];
        int option2 = nums[n - 2] - nums[2];
        int option3 = nums[n - 3] - nums[1];
        int option4 = nums[n - 4] - nums[0];

        return Math.min(Math.min(option1, option2), Math.min(option3, option4));
    }
}
