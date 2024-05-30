
// LeetCode : https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/


public class CountTripletsThatCanFormTwoArraysOfEqualXOR {
    public int countTriplets(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            for (int k = i + 1; k < arr.length; k++) {
                val = val ^ arr[k];

                if (val == 0) {
                    count += (k - i);
                }
            }
        }

        return count;
    }
}
