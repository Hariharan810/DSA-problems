
// LeetCode : https://leetcode.com/problems/relative-ranks/description/?envType=daily-question&envId=2024-05-08

import java.util.Arrays;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {

        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);

        String[] result = new String[score.length];

        int count = 1;
        for(int i=temp.length-1;i>=0;i--){
            int index = helper(score,temp[i]);
            if(count<=3){

                if(count==1){
                    result[index] = "Gold Medal";
                }
                else if(count==2){
                    result[index] = "Silver Medal";
                }
                else{
                    result[index] = "Bronze Medal";
                }
            }
            else{
                result[index] = Integer.toString(count);
            }
            count++;
        }
        return result;
    }

    public static int helper(int[] score,int element){
        for(int i=0;i<score.length;i++){
            if(score[i]==element){
                return i;
            }
        }
        return -1;
    }
}
