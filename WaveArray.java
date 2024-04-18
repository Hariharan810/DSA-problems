
// GFG : https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1

public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<n-1;i+=2){

            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;

        }
    }
}
