
// LeetCode
// Problem Link : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder concat1=concat(word1,new StringBuilder());
        StringBuilder concat2=concat(word2,new StringBuilder());
        return concat1.toString().equals(concat2.toString());
    }
    private  StringBuilder concat(String[] word,StringBuilder str){
        for (int i = 0; i < word.length; i++) {
            str.append(word[i]);
        }
        return str;
    }
}
