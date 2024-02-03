
// LeetCode
// Probelm Link : https://leetcode.com/problems/combination-sum-ii/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList =new ArrayList<>();
        Arrays.sort(candidates);

        recursive(candidates,target,list,tempList,0);
        return list;
    }
    public static void recursive(int[] nums,int target,List<List<Integer>> list,
                                 List<Integer> tempList,int index){

        if(target==0){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }

            tempList.add(nums[i]);
            recursive(nums,target-nums[i],list,tempList,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
