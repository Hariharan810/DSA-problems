
// LeetCode: https://leetcode.com/problems/reorder-list/


public class ReorderList {

    public void reorderList(ListNode head) {

        if(head==null || head.next==null)return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newNode = reverseLL(slow.next);

        slow.next = null;

        ListNode firstList = head;
        ListNode secondList = newNode;

        while(firstList != null && secondList != null){

            ListNode temp1 = firstList.next;
            firstList.next = secondList;

            ListNode temp2 = secondList.next;
            secondList.next = temp1;

            firstList = temp1;
            secondList = temp2;
        }

    }

    public static ListNode reverseLL(ListNode head){

        ListNode prev = null;
        ListNode cur = head;

        while(cur!=null){
            ListNode front = cur.next;
            cur.next = prev;
            prev = cur;
            cur = front;
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
