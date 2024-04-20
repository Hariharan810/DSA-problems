
// LeetCode : https://leetcode.com/problems/find-all-groups-of-farmland/


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FindAllGroupsOfFarmland {
    public int[][] findFarmland(int[][] land) {

        List<List<Integer>> result = new ArrayList<>();

        int row = land.length;
        int col = land[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(land[i][j] == 1){
                    if((i == 0 || land[i-1][j] == 0)
                            && (j == 0 || land[i][j-1] == 0)){

                        int right = j;
                        int down = i;

                        while(right+1 < col && land[i][right+1] == 1)right++;
                        while(down+1 < row && land[down+1][j] == 1)down++;

                        result.add(Arrays.asList(i,j,down,right));
                    }
                }
            }
        }

        int[][] ans = new int[result.size()][4];

        for(int i=0;i<result.size();i++){
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
            ans[i][2] = result.get(i).get(2);
            ans[i][3] = result.get(i).get(3);
        }

        return ans;
    }
}
