
// GFG : https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1


public class RemoveDuplicateElementFromSortedLinkedList {
    Node removeDuplicates(Node head)
    {
        // Your code here
        Node temp = head;
        while(temp != null && temp.next != null){

            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }

        }

        return head;

    }

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
}
