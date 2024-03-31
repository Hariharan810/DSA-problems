
//GFG: https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindAllPairsWithAGivenSum {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {

        Arrays.sort(A);
        HashSet<Long> set = new HashSet<>();

        ArrayList<pair> list = new ArrayList<>();

        for(long num:B)
            set.add(num);

        for(long num: A){

            long find = (X - num);

            if(set.contains(find)){
                list.add(new pair( num, find));
            }
        }

        pair[] result = new pair[list.size()];

        for (int i = 0; i < list.size(); i++) {
            pair p = list.get(i);
            result[i] = new pair(p.first, p.second);
        }
        return result;
    }

    class pair  {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
}
