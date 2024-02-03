
// LeetCode
// Problem Link : https://www.codingninjas.com/studio/problems/count-nodes-of-linked-list_5884



public class CountNodesOfLinkedList {

    public static int length(Node head){
        //Your code goes here
        int count=0;
        Node temp = head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

///////////////////////////////////////////////////

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
}

