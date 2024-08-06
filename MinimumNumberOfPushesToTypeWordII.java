
// LeetCode : https://leetcode.com/problems/minimum-number-of-pushes-to-type-a-word/


import java.util.Arrays;
import java.util.Collections;

public class MinimumNumberOfPushesToTypeWordII {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        int result = 0;

        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }

        Integer[] sortedFreq = new Integer[26];

        for(int i=0;i<freq.length;i++){
            sortedFreq[i] = freq[i];
        }

        Arrays.sort(sortedFreq, Collections.reverseOrder());

        for(int i=0;i<sortedFreq.length;i++){
            if(sortedFreq[i] == 0)break;
            result += (sortedFreq[i] * ((i/8)+1));
        }

        return result;
    }
}
