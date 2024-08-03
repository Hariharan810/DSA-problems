
// LeetCode : https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/


public class MakeTwoArraysEqualByReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {

        int[] num = new int[1001];

        for(int i=0;i<target.length;i++){
            num[target[i]]++;
        }

        for(int i=0;i<arr.length;i++){
            num[arr[i]]--;
        }

        for(int i=0;i<num.length;i++){
            if(num[i] != 0){
                return false;
            }
        }

        return true;
    }
}
