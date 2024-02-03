
// LeetCode
// Problem Link : https://www.codingninjas.com/studio/problems/introduction-to-linked-list_8144737

public class IntroductionToLinkedList {
    public Node constructLL(int[] arr) {
        // Write your code here
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
///////////////////////////////////////////////////////
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

