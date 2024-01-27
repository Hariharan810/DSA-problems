//Coding Ninjas
//Problem Link : https://www.codingninjas.com/studio/problems/allocate-books_1090540

import java.util.*;
public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n){
            return -1;
        }
        int low=Collections.max(arr);
        int high=0;
        for(int i=0;i<n;i++){
            high+=arr.get(i);
        }

        while(low<=high){

            int mid=(low+high)/2;

            int students=countStudents(arr,mid);

            if(students>m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static int countStudents(ArrayList<Integer> arr,int maxPages){
        int noOfStudents=1;
        int pages=0;

        for(int i=0;i<arr.size();i++){
            if(pages+arr.get(i)<=maxPages){
                pages+=arr.get(i);
            }
            else{
                noOfStudents++;
                pages=arr.get(i);
            }
        }
        return noOfStudents;
    }
}
