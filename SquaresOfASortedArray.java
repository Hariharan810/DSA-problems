
// LeetCode
// Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/?envType=daily-question&envId=2024-03-02

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int square = 0;
        int i = nums.length-1;
        int[] result = new int[nums.length];
        while(left<=right){

            if(Math.abs(nums[left])>Math.abs(nums[right])){
                square = nums[left];
                left++;
            }
            else{
                square = nums[right];
                right--;
            }

            result[i]=square*square;
            i--;
        }
        return result;
    }
}
