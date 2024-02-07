

// LeetCOde
// Problem Link : https://www.codingninjas.com/studio/problems/reverse-a-doubly-linked-list_1116098



public class ReverseADoublyLinkedList {


    public static Node reverseDLL(Node head)
    {

        if(head==null || head.next==null){
            return head;
        }

        Node temp = null;
        Node current = head;

        while(current!=null){

            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;

        }
        head = temp.prev;
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

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
            this.prev = next;
        }
    };
}
