
// Coding Ninjas
// Problem Link : https://www.codingninjas.com/studio/problems/insert-at-end-of-doubly-linked-list_8160464



public class InsertAtEndOfDoublyLinkedList {

    public  Node insertAtTail(Node list, int K) {

        Node dummy = new Node(K);

        if(list==null) return dummy;

        Node temp=list;

        while( temp.next!=null)
        {
            temp=temp.next;

        }

        dummy.prev=temp;

        temp.next=dummy;

        return list;
    }

    class Node {
        public int data;
        public Node next;
        public Node prev;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    };
}
