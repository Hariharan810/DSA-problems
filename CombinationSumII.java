
// LeetCode
// Probelm Link : https://leetcode.com/problems/combination-sum-ii/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        findCombinations(0,candidates,target,result,new ArrayList<>());

        return result;

    }

    static void findCombinations(int ind,int[] arr,int target,List<List<Integer>>
            result, List<Integer> list) {

        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            list.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],result,list);
            list.remove(list.size()-1);
        }

    }
}
