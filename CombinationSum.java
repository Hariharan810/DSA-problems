
// LeetCode
// Probelm Link : https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList =new ArrayList<>();

        recursive(candidates,target,list,tempList,0);
        return list;
    }
    public static void recursive(int[] nums,int target,List<List<Integer>> list,
                                 List<Integer> tempList,int i){

        if(i==nums.length){
            if(target==0){
                list.add(new ArrayList<>(tempList));
            }
            return;
        }

        if(nums[i]<=target){
            tempList.add(nums[i]);
            recursive(nums,target-nums[i],list,tempList,i);
            tempList.remove(tempList.size()-1);
        }
        recursive(nums,target,list,tempList,i+1);
    }
}
