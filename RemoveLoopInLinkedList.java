
// GFG : https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1


public class RemoveLoopInLinkedList {
    public static void removeLoop(Node head){

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null){

            slow = slow.next;
            prev = fast.next;
            fast = fast.next.next;

            if(slow == fast)break;
        }

        if(fast == null || fast.next == null)return;

        slow = head;

        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;

    }

    class Node
    {
        int data;
        Node next;
    }
}
