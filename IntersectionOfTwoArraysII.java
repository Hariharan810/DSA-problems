
// LeetCode : https://leetcode.com/problems/intersection-of-two-arrays-ii/


import java.util.ArrayList;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] freqCount = new int[1001];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            freqCount[nums1[i]]++;
        }

        for(int i=0;i<nums2.length;i++){
            if(freqCount[nums2[i]] > 0){
                result.add(nums2[i]);
                freqCount[nums2[i]]--;
            }
        }
        int[] ans = new int[result.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
