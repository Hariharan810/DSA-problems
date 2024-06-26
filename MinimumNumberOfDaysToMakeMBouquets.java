
// LeetCode : https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/


class MinimumNumberOfDaysToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long val=(long)m*k;

        if(val>n){
            return -1;
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }

        int start=min;
        int end=max;

        while(start<=end){

            int mid=(start+end)/2;

            if(possible(bloomDay,mid,m,k)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static boolean possible(int[] arr,int days,int m,int k){
        int count=0;
        int bouquets=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                count++;
            }
            else{
                bouquets+=(count/k);
                count=0;
            }
        }
        bouquets+=(count/k);

        return bouquets>=m;
    }
}
