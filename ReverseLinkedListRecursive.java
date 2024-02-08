
// LeetCOde
// Problem Link : https://www.codingninjas.com/studio/problems/reverse-linked-list_920513



public class ReverseLinkedListRecursive {

    public static Node reverseLinkedList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newNode = reverseLinkedList(head.next);

        Node front = head.next;
        front.next=head;
        head.next=null;
        return newNode;
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
}
