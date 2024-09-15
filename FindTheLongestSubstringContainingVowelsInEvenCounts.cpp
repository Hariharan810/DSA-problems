
// LeetCode : https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/


class Solution {
public:
    int findTheLongestSubstring(string s) {
        map<int,int> map;
        map[0] = -1;

        int cnt = 0,ans = 0;

        for(int i=0;i<s.size();i++){

            if (s[i] == 'a') {
                cnt ^= (1 << 0);
            } else if (s[i] == 'e') {
                cnt ^= (1 << 1);
            } else if (s[i] == 'i') {
                cnt ^= (1 << 2);
            } else if (s[i] == 'o') {
                cnt ^= (1 << 3);
            } else if (s[i] == 'u') {
                cnt ^= (1 << 4);
            }

            if(map.count(cnt)){
                ans = max(ans,i-map[cnt]);
            }
            else{
                map[cnt] = i;
            }
        }

        return ans;
    }
};