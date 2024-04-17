
// GFG : https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

public class RotateArray {
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d = d % n;

        swap(arr,0,d-1);
        swap(arr,d,n-1);
        swap(arr,0,n-1);

    }
    public static void swap(int[] arr,int first,int end){

        while(first<end){
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;
        }
    }
}
