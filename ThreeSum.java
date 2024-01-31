

//LeetCode Link : https://leetcode.com/problems/3sum/

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer> > result = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right){

                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}

//Approach 2
class ThreeSum2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}
