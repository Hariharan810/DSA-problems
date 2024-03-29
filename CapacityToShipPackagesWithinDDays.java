//LeetCode
//Problem Link : https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        
        int start=Integer.MIN_VALUE;
        int end=0;

        for(int i=0;i<weights.length;i++){
            end+=weights[i];
            start=Math.max(start,weights[i]);
        }

        while(start<=end){

            int mid=(start+end)/2;

            if(capacity(weights,mid)<=days){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int capacity(int nums[],int cap){

        int weight=0;
        int days=1;

        for(int i=0;i<nums.length;i++){
            if(weight+nums[i]>cap){
                days+=1;
                weight=nums[i];
            }
            else{
                weight+=nums[i];
            }
        }
        return days;
    }
}
