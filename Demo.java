import java.util.*;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {12,6,1,2,7};

        long score = 0;
        int[] maxLeft = new int[nums.length], maxRight = new int[nums.length];;
        maxLeft[0] = nums[0];
        maxRight[nums.length-1] = nums[nums.length-1];
        for(int i=1; i<nums.length; i++) maxLeft[i] = Math.max(maxLeft[i-1], nums[i]);
        for(int i=nums.length-2; i>=0; i--)   maxRight[i] = Math.max(maxRight[i+1], nums[i]);
        for (int i=1; i<nums.length-1; i++) {
            long currScore = (long)(maxLeft[i-1]-nums[i])*maxRight[i+1];
            score = Math.max(score, currScore);
        }
        System.out.println(score);
    }
}
