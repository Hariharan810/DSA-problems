
// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/implement-queue-using-linked-list_8161235




public class ImplementQueueUsingLinkedList {

    public class Solution extends Queue{
        public void push(int x) {
            Node temp = new Node(x);
            if(temp==null){
                return;
            }
            else{
                if(front==null){
                    front=temp;
                    rear=temp;
                }
                else{
                    rear.next=temp;
                    rear=temp;
                }
            }
        }

        public int pop() {
            if(front==null)return -1;
            int poped = front.data;
            front=front.next;
            return poped;
        }
    }

    class Node {
        public int data;
        public Node next;

        Node()
        {
            this.data = 0;
            this.next = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    class Queue{
        Node front;
        Node rear;
        void push(){};
        Queue() {
            front = null;
            rear = null;
        }
    }
}
