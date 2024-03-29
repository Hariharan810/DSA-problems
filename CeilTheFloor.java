//Coding Ninjas
//Problem Link : https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401

import java.util.* ;
import java.io.*; 

public class CeilTheFloor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int f=floor(a,n,x);
      int c=ceil(a,n,x);
      return new int[]{f,c};
    }
    public static int floor(int[] arr,int n,int target){
      int start=0;
      int end=n-1;
      int ans=-1;

      while(start<=end){

        int mid=(start+end)/2;

        if(arr[mid]<=target){
          ans=arr[mid];
          start=mid+1;
        }
        else{
          end=mid-1;
        }
      }
      return ans;
    }

    public static int ceil(int[] arr,int n,int target){
      int start=0;
      int end=n-1;
      int ans=-1;

      while(start<=end){

        int mid=(start+end)/2;

        if(arr[mid]>=target){
          ans=arr[mid];
          end=mid-1;
        }
        else{
          start=mid+1;
        }
      }
      return ans;
    }
}
