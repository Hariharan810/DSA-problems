
// LeetCode
// Problem Link : https://leetcode.com/problems/next-greater-element-i/


import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> mp = new HashMap<>();

        for(int i=0;i<nums2.length;i++)
        {
            while(!st.isEmpty() && nums2[i] > nums2[st.peek()])
            {
                mp.put(nums2[st.peek()] , nums2[i]);
                st.pop();
            }
            st.add(i);
        }

        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            arr[i] = mp.getOrDefault(nums1[i] , -1);
        }
        return arr;
    }
}
