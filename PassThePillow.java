
// LeetCode : https://leetcode.com/problems/pass-the-pillow/?envType=daily-question&envId=2024-07-06


public class PassThePillow {
    public int passThePillow(int n, int time) {

        int rounds = time/(n-1);
        int ans = 0;

        if(rounds%2 == 0){
            ans = (time%(n-1) + 1);
        }
        else{
            ans = (n - time%(n-1));
        }

        return ans;
    }
}
