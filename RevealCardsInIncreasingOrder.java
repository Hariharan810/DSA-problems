
// LeetCode: https://leetcode.com/problems/reveal-cards-in-increasing-order/

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);

        int n = deck.length;
        int[] result = new int[n];

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        for (int card : deck) {
            int idx = queue.poll();
            result[idx] = card;
            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            }
        }

        return result;
    }
}
