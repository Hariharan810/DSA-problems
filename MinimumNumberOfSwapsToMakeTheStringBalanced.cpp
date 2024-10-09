
// LeetCode : https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/

class Solution {
public:
    int minSwaps(string s) {

        int unMatched = 0;

        for(char ch : s){

            if(ch == '['){
                unMatched++;
            }
            else{
                if(ch == ']' && unMatched > 0){
                    unMatched--;
                }
            }
        }

        return (unMatched+1) / 2;
    }
};