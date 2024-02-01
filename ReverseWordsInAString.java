//LeetCode
//Problem Link : https://leetcode.com/problems/reverse-words-in-a-string/

class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder("");

        for(int i=str.length-1;i>=0;i--){
            if(result.length()!=0){
                result.append(" ");
            }
            result.append(str[i]);
        }
        return result.toString();
    }
}
