
// LeetCode : https://leetcode.com/problems/find-the-winner-of-the-circular-game/


import java.util.ArrayList;

public class FindTheWinnerOfTheCircularGame {
    public int findTheWinner(int n, int k) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int index = 0;

        while (arr.size() > 1) {
            index = (index + k - 1) % arr.size();
            arr.remove(index);
        }

        return arr.get(0);
    }
}
