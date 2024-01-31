//LeetCode
//Problem Link : https://www.codingninjas.com/studio/problems/aggressive-cows_1082559

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int []stalls, int k) {
        
        Arrays.sort(stalls);
        int n=stalls.length;

        int low=1;
        int high=stalls[n-1]-stalls[0];
        int ans=-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(placeCows(stalls,mid,k)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean placeCows(int[] arr,int distance,int cows){
        int count=1;
        int lastCow=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]-lastCow>=distance){
                lastCow=arr[i];
                count++;
            }
            if(count>=cows){
                return true;
            }
        }
        return false;
    }
}
