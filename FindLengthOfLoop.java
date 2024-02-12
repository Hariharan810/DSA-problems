
// LeetCOde
// Problem Link : https://www.codingninjas.com/studio/problems/find-length-of-loop_8160455


public class FindLengthOfLoop {

    public static int lengthOfLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                int count = 1;
                fast = fast.next;

                while(slow != fast){

                    count++;
                    fast = fast.next;
                }

                return count;
            }
        }
        return 0;
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
    };
}
