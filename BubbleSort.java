//Coding Ninjas 
//Problem Link:https://www.codingninjas.com/studio/problems/bubble-sort_624380

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i=n-1;i>=0;i--){
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
