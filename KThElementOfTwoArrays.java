
// GFG : https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

public class KThElementOfTwoArrays {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        int firstIndex = 0;
        int secondIndex = 0;
        int mergedIndex = 0;

        int[] result = new int[n+m];

        while(firstIndex<n && secondIndex<m){

            if(arr1[firstIndex]<arr2[secondIndex]){
                result[mergedIndex] = arr1[firstIndex];
                firstIndex++;
            }
            else{
                result[mergedIndex] = arr2[secondIndex];
                secondIndex++;
            }
            mergedIndex++;
        }

        while(firstIndex<n){
            result[mergedIndex] = arr1[firstIndex];
            firstIndex++;
            mergedIndex++;
        }
        while(secondIndex<m){
            result[mergedIndex] = arr2[secondIndex];
            secondIndex++;
            mergedIndex++;
        }

        for(int i=0;i<result.length;i++){
            if(i==k-1){
                return result[i];
            }
        }
        return -1;
    }
}
