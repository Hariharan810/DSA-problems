
// LeetCode
// Problem Link : https://leetcode.com/problems/first-unique-character-in-a-string/?envType=daily-question&envId=2024-02-05

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {

        int countArray[]=new int[26];
        for(char c:s.toCharArray()){
            countArray[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(countArray[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

//    Map<Character,Integer> map = new HashMap<>();
//
//        for(int i=0;i<s.length();i++){
//        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//    }
//
//        for(int i=0;i<s.length();i++){
//        if(map.get(s.charAt(i))==1){
//            return i;
//        }
//    }
//        return -1;
}
