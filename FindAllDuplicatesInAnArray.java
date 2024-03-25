
// LeetCode: https://leetcode.com/problems/find-all-duplicates-in-an-array/


import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {

        int[] temp = new int[nums.length+1];
        List<Integer> list = new ArrayList<>();

        for(int num:nums){
            temp[num]++;
        }

        for(int i=1;i<temp.length;i++){
            if(temp[i]==2){
                list.add(i);
            }
        }
        return list;
    }
}
