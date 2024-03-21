
// LeetCode: https://leetcode.com/problems/reverse-linked-list-ii/


public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }

        ListNode cur = prev.next;

        for(int i=0;i<right-left;i++){
            ListNode forward = cur.next;
            cur.next = forward.next;
            forward.next = prev.next;
            prev.next = forward;
        }

        return dummy.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
