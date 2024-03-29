
// GFG Link: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1


public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n){

        long max = arr[0];
        long sum = 0;

        for(int i = 0;i < arr.length;i++){

            sum += arr[i];

            max = Math.max(max,sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}
