
// GFG : https://practice.geeksforgeeks.org/problems/key-pair5616/1

import java.util.HashMap;

public class KeyPair {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int complement = x-arr[i];

            if(map.containsKey(complement)){
                return true;
            }

            map.put(arr[i],complement);
        }
        return false;
    }
}
