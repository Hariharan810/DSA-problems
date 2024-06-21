
// LeetCode : https://leetcode.com/problems/grumpy-bookstore-owner/


public class GrumpyBookstoreOwner {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int left = 0;
        int window = 0;
        int satisfied = 0;
        int maxWindow = 0;

        for(int right = 0;right<customers.length;right++){

            if(grumpy[right] == 1){
                window += customers[right];
            }
            else{
                satisfied += customers[right];
            }

            if((right - left + 1) > minutes){

                if(grumpy[left] == 1){
                    window -= customers[left];
                }

                left++;
            }

            maxWindow = Math.max(window,maxWindow);
        }

        return satisfied + maxWindow;
    }
}
