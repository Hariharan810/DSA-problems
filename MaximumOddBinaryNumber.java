
// LeetCode
// Problem Link : https://leetcode.com/problems/maximum-odd-binary-number/?envType=daily-question&envId=2024-03-01


import java.util.Arrays;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {

        char[] ch = s.toCharArray();

        Arrays.sort(ch);

        int first = 0;
        int last = ch.length-1;

        while(first<last){
            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
            first++;
            last--;
        }

        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='1'){
                char temp = ch[i];
                ch[i] = ch[ch.length-1];
                ch[ch.length-1] = temp;
                break;
            }
        }
        return new String(ch);
    }
}

//class Solution {
//    public String maximumOddBinaryNumber(String s) {
//        int len = s.length();
//        int ones = -1;
//        for(int i=0; i < len; i++) {
//            if(s.charAt(i) == '1') {
//                ones++;
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i< s.length()-1; i++, ones--) {
//            sb.append(ones > 0 ? '1' : '0');
//        }
//
//        return sb.append('1').toString();
//    }
//}
