
// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/implement-queue-using-arrays_8390825

public class ImplementQueueUsingArrays {

    class Queue {
        int front, rear;
        int []arr;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            // Write your code here.
            if(rear==arr.length-1)return;

            arr[rear]=e;
            rear+=1;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            // Write your code here.
            if(rear==0) return -1;

            front = arr[0];

            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear-=1;
            return front;
        }
    }
}
