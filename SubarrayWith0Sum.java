
// GFG : https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1


import java.util.HashMap;

public class SubarrayWith0Sum {
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int temp = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(temp < n){

            if(arr[temp] == 0)return true;

            sum += arr[temp];

            if(sum == 0)return true;

            if(!map.containsKey(sum)){
                map.put(sum,1);
            }

            else{
                return true;
            }

            temp++;
        }

        return false;
    }
}
