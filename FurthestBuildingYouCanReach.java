
// LeetCode
// problem Link : https://leetcode.com/problems/furthest-building-you-can-reach/?envType=daily-question&envId=2024-02-17




import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b - a);

        int i = 0, diff = 0;
        for (i = 0; i < heights.length - 1; i++) {
            diff = heights[i + 1] - heights[i];

            if (diff <= 0) {
                continue;
            }

            bricks -= diff;
            p.offer(diff);

            if (bricks< 0) {
                bricks += p.poll();
                ladders--;
            }

            if (ladders < 0) {
                break;
            }
        }

        return i;


    }
}
