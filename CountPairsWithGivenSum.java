
//GFG: https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1


import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int n, int k) {

        Map<Integer, Integer> map=new HashMap<>();

        int count=0;

        for(int i=0; i<n; i++){

            int sum=k-arr[i];

            if(map.containsKey(sum)){
                count+=map.get(sum);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        }

        return count;
    }
}
