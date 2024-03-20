
// LeetCode: https://leetcode.com/problems/merge-in-between-linked-lists/


public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode firstNode = list1;
        ListNode secondNode = list1;
        ListNode result = firstNode;
        int i = 1;
        int j = 0;

        while (i < a) {
            firstNode = firstNode.next;
            i++;
        }

        while (j < b) {
            secondNode = secondNode.next;
            j++;
        }

        firstNode.next = list2;
        ListNode list2Tail = list2;

        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }

        list2Tail.next = secondNode.next;

        return result;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
