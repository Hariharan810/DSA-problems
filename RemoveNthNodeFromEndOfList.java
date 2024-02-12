
// LeetCOde
// Problem Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/



public class RemoveNthNodeFromEndOfList {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        if(fast == null)return head.next;

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode delNode = slow.next;
        slow.next = slow.next.next;

        return head;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
