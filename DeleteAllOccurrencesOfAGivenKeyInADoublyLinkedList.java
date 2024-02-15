
// LeetCode
// problem Link : https://www.codingninjas.com/studio/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461



public class DeleteAllOccurrencesOfAGivenKeyInADoublyLinkedList {


    public static Node deleteAllOccurrences(Node head, int k) {

        Node temp = head;

        while(temp!=null){

            if(temp.data == k){
                if(temp==head){
                    head = temp.next;
                }

                Node prevNode = temp.prev;
                Node nextNode = temp.next;

                if(prevNode!=null){
                    prevNode.next = nextNode;
                }
                if(nextNode!=null){
                    nextNode.prev = prevNode;
                }
                temp = nextNode;
            }
            else{
                temp = temp.next;
            }
        }
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
    }
}
