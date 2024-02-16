
// LeetCode
// problem Link : https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/?envType=daily-question&envId=2024-02-16



import java.util.*;

public class LeastNumberOfUniqueIntegersAfterKRemovals {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {


        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Integer> frequencies = new ArrayList<>(map.values());

        Collections.sort(frequencies);

        int i = 0;
        int uniqueElement = map.size();

        while(k>0 && i<frequencies.size()){

            if(frequencies.get(i)<=k){
                k-=frequencies.get(i);
                uniqueElement--;
            }
            i++;
        }
        return uniqueElement;
    }
}
