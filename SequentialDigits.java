
// LeetCode
// Problem Link : https://leetcode.com/problems/sequential-digits/?envType=daily-question&envId=2024-02-02

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> result = new ArrayList<>();

        for(int i=1;i<=9;i++){

            int num=i;
            int nextNum=i+1;

            while(num<=high && nextNum<=9){

                num = num * 10 + nextNum;

                if(low<=num && num<=high){
                    result.add(num);
                }
                nextNum++;
            }
            Collections.sort(result);
        }
        return result;
    }
}
