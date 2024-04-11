
// GFG: https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1


import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    int maxLen(int arr[], int n)
    {
        int sum = 0;
        int maxLength = 0;
        int i = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum,-1);

        while(i<n){

            sum += arr[i];

            if(map.containsKey(sum)){

                int tempLength = i - map.get(sum);

                maxLength = Math.max(maxLength,tempLength);
            }
            else{
                map.put(sum,i);
            }
            i++;
        }

        return maxLength;

    }
}
