
// GFG : https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1


public class BitonicPoint {
    int findMaximum(int[] arr, int n) {
        // code here
        for(int i=1;i<n;i++){

            if(arr[i] < arr[i-1]){
                return arr[i-1];
            }
        }
        return arr[n-1];
    }
}
