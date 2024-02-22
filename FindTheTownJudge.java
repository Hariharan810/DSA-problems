
// LeetCode
// Problem Link : https://leetcode.com/problems/find-the-town-judge/description/?envType=daily-question&envId=2024-02-22

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {

        int[] result = new int[n+1];

        for(int[] relation : trust){
            result[relation[0]]--;
            result[relation[1]]++;
        }

        for(int i=1;i<=n;i++){
            if(result[i] == n-1)return i;
        }
        return -1;
    }

}
