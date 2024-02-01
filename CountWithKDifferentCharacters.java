// Coding Ninjas
// Problem Link : https://www.codingninjas.com/studio/problems/count-with-k-different-characters_1214627


import java.util.Arrays;
public class CountWithKDifferentCharacters {
    public static int countSubstringsWithKDifferentCharacters(String str, int k) {
        int res = 0;
        int n = str.length();

        boolean seen[] = new boolean[26];

        for (int i = 0; i < n; i++)
        {
            int distCount = 0;

            Arrays.fill(seen, false);

            for (int j=i; j<n; j++){
                if (!seen[str.charAt(j) - 'a'])
                    distCount++;

                seen[str.charAt(j) - 'a'] = true;

                if (distCount == k)
                    res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "aacfssa";
        int k = 3;
        System.out.println(countSubstringsWithKDifferentCharacters(s, k));
    }
}
