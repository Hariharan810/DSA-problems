//Coding Ninjas
//Problem Link : https://www.codingninjas.com/studio/problems/binary-search_972

public class BinarySearch {
    public static int search(int []nums, int target) {
        // Write your code here.

        int start=0;
        int end=nums.length-1;

        while(start<=end){

            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
