
// LeetCode : https://leetcode.com/problems/water-bottles/


public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = 0;
        int empty = 0;

        while(numBottles > 0){

            result += numBottles;
            empty += numBottles;

            numBottles = empty/numExchange;
            empty = empty % numExchange;
        }

        return result;
    }
}
