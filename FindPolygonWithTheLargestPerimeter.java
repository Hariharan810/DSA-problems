
// LeetCode
// problem Link : https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/description/?envType=daily-question&envId=2024-02-15


import java.util.Arrays;

public class FindPolygonWithTheLargestPerimeter {

    public long largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        long totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){

            long rem = totalSum-nums[i];
            if(rem>nums[i]){
                return totalSum;
            }
            totalSum-=nums[i];
        }
        return -1;
    }

}
