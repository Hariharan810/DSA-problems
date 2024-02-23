
// LeetCode
// Problem Link : https://leetcode.com/problems/cheapest-flights-within-k-stops/?envType=daily-question&envId=2024-02-23


public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        int[] prev = new int[n];

        for(int i=0;i<n;i++) {
            prev[i] = Integer.MAX_VALUE;
            dist[i] = Integer.MAX_VALUE;
        }

        for(int i=0;i<=k;i++) {
            prev[src] = 0;
            for(int[] flight : flights) {
                int s = flight[0], d = flight[1], cost = flight[2];

                if(prev[s] == Integer.MAX_VALUE) continue;

                if(prev[s] + cost < dist[d])
                    dist[d] = prev[s] + cost;
            }
            copy(dist, prev);
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];

    }

    private void copy(int[] src, int[] dest) {
        for(int i=0;i<src.length;i++)
            dest[i] = src[i];
    }
}
