
// LeetCOde
// Problem Link : https://leetcode.com/problems/reverse-linked-list/


public class ReverseLinkedListIterative {


    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
