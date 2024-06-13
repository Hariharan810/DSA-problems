
// LeetCode : https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/


import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {

//        Arrays.sort(seats);
//        Arrays.sort(students);
//
//        int diff = 0;
//        for(int i=0;i<seats.length;i++){
//            diff += Math.abs(seats[i] - students[i]);
//        }
//
//        return diff;

        int maxPosition = 100;

        int[] seatCount = new int[maxPosition + 1];
        int[] studentCount = new int[maxPosition + 1];

        for (int seat : seats) {
            seatCount[seat]++;
        }
        for (int student : students) {
            studentCount[student]++;
        }

        int moves = 0;
        int i = 0, j = 0;

        for (i = 0; i < seatCount.length; i++) {
            if(seatCount[i] == 0)continue;
            while(studentCount[j] == 0)j++;
            moves += Math.abs(i - j);
            seatCount[i]--;
            studentCount[j]--;
            if(seatCount[i] != 0)i--;
        }

        return moves;
    }
}
