
// LeetCode
// problem Link : https://www.codingninjas.com/studio/problems/remove-duplicates-from-a-sorted-doubly-linked-list_2420283



public class RemoveDuplicatesFromASortedDoublyLinkedList {


    public static Node uniqueSortedList(Node head) {

        Node temp = head;

        while(temp!=null && temp.next!=null){
            Node nextNode = head.next;

            while(nextNode!=null && temp.data==nextNode.data){

                nextNode = nextNode.next;

            }

            temp.next = nextNode;
            if(nextNode!=null) nextNode.prev = temp;

            temp = temp.next;
        }
        return head;
    }

    class Node
    {
        public
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
}
