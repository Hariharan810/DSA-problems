//LeetCode
//Problem Link : https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        
        int sum=0;
        int prev=translate(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int current=translate(s.charAt(i));

            if(current>prev){
                sum-=prev;
            }
            else{
                sum+=prev;
            }
            prev=current;
        }
        sum+=prev;

        return sum;

    }

    public static int translate(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;                             
        }
    }
}
