
// GFG : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

public class ReverseALinkedList {
    Node reverseList(Node head)
    {
        // code here

        Node prev = null;
        Node temp = head;

        while(temp != null){

            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
    class Node {
        private final int value;
        int data;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

}
