
// LeetCode
// Problem Link : https://www.codingninjas.com/studio/problems/search-in-a-linked-list_975381



public class SearchInALinkedList {
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        Node temp = head;

        while(temp!=null){

            if(temp.data==k)return 1;
            temp=temp.next;
        }
        return 0;
    }
 ///////////////////////////////
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
