
// GFG : https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1


public class DetectLoopInLinkedList {
    public static boolean detectLoop(Node head){
        // Add code here

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
}
