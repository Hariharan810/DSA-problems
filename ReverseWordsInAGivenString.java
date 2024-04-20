
// GFG : https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1


public class ReverseWordsInAGivenString {
    String reverseWords(String S)
    {
        // code here

        StringBuilder result = new StringBuilder();
        String[] strArr = S.split("\\.");

        int count = 0;
        for(int i=strArr.length-1;i>=0;i--){
            if(count > 0){
                result.append(".");
            }
            result.append(strArr[i]);
            count++;
        }

        return result.toString();
    }
}
