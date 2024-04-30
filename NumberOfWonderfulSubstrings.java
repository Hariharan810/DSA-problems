
// LeetCode : https://leetcode.com/problems/number-of-wonderful-substrings/

public class NumberOfWonderfulSubstrings {
    public long wonderfulSubstrings(String word) {
        long[] cnt = new long[1024];
        cnt[0] = 1;
        int mask = 0;
        long ans = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int idx = c - 'a';
            mask ^= 1 << idx;
            ans += cnt[mask];
            for (int i = 1; i <= 512; i*=2) {
                ans += cnt[mask ^ i];
            }
            cnt[mask]++;
        }
        return ans;
    }
}
