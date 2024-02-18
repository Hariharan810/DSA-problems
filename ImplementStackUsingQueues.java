
// LeetCode
// problem Link : https://leetcode.com/problems/implement-stack-using-queues/



import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    class MyStack {

        Queue<Integer> queue;
        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.add(x);

            int size = queue.size();

            for(int i=0;i<size-1;i++){
                queue.add(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
