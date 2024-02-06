
// Coding Ninjas
// Problem Link : https://www.codingninjas.com/studio/problems/delete-last-node-of-a-doubly-linked-list_8160469




public class DeleteLastNodeOfADoublyLinkedList {

    public  Node deleteLastNode(Node head) {
        if(head == null || head.next == null)
            return null;

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;

        }
        Node temp = curr.prev;
        temp.next = null;
        temp.prev = null;
        return head;
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
