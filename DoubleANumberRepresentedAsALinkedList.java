
// LeetCode : https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/?envType=daily-question&envId=2024-05-07


public class DoubleANumberRepresentedAsALinkedList {
    public ListNode doubleIt(ListNode head) {

        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {

            int twice = cur.val * 2;

            if (twice < 10) {
                cur.val = twice;
            } else if (prev != null) {

                cur.val = twice % 10;
                prev.val = prev.val + 1;
            } else {
                head = new ListNode(1, cur);
                cur.val = twice % 10;
            }

            prev = cur;
            cur = cur.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

    }
}
