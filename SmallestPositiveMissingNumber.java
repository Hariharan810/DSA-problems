

// GFG : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number3051/1

import java.util.HashSet;

public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashSet<Integer> set = new HashSet<>();

        for(int nums:arr){
            set.add(nums);
        }

        for(int i=1;i<=size;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return size+1;
    }
}
