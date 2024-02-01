// LeetCode
// Problem Link : https://leetcode.com/problems/sum-of-beauty-of-all-substrings/


public class SumofBeautyofAllSubstrings {
    public int beautySum(String s) {
        if(s == null || s.length() <= 0) return 0;
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for(int f : freq){
                    if(f > 0){
                        maxFreq = Integer.max(f, maxFreq);
                        minFreq = Integer.min(f, minFreq);
                    }
                }
                sum += maxFreq-minFreq;
            }
        }
        return sum;
    }
}
