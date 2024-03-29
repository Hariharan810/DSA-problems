
// GFG Link: https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1


public class MinimumNumberOfJumps {
    static int minJumps(int[] arr){

        int n = arr.length;
        int count = 0;
        int  curr =0;
        int temp = 0 ;

        if(n==0)
            return count;
        else if(n==1)
            return 0;
        if(arr[0]==0)
            return -1;

        for(int i = 0 ; i<n-1 ; i++){

            temp = Math.max(temp , arr[i]+i);

            if(i==curr){
                count++;
                curr=temp;
            }

            if(curr>=n-1){
                return count ;
            }

        }
        return -1;
    }
}
