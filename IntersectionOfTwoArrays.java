
// LeetCode: https://leetcode.com/problems/intersection-of-two-arrays/?envType=daily-question&envId=2024-03-10



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for(int num:nums1){
            set.add(num);
        }

        List<Integer> list = new ArrayList<>();

        for(int num:nums2){
            if(set.contains(num)){
                list.add(num);
            }
            set.remove(num);
        }

        int[] result = new int[list.size()];

        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }

        return result;
    }}
