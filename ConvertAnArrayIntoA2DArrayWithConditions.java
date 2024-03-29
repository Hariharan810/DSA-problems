//LeetCode Link : https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ConvertAnArrayIntoA2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<List<Integer>> result=new ArrayList<>();

        while(!map.isEmpty()){
            List<Integer> list = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();

            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                int key=entry.getKey();
                int value=entry.getValue();
                list.add(key);
                value--;
                if(value==0){
                    temp.add(key);
                }
                map.put(key,value);
            }
            result.add(list);
            for(int i:temp){
                map.remove(i);
            }
        }
        return result;
    }
}
