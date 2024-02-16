
// LeetCode
// problem Link : https://leetcode.com/problems/reverse-nodes-in-k-group/



public class ReverseNodesInkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode preTail = null;
        ListNode curHead = head;
        ListNode curTail = head;
        ListNode nextHead = null;

        while(curHead != null)
        {
            int count = 1;

            while(curTail.next != null && count < k)
            {
                curTail = curTail.next;
                count++;
            }

            if(count != k)
            {
                break;
            }

            nextHead = curTail.next;

            curTail.next = null;

            if(preTail != null)
            {
                preTail.next = null;
            }


            curTail = reverse(curHead);

            if(preTail != null)
            {
                preTail.next = curTail;
            }
            else
            {
                head = curTail;
            }

            curHead.next = nextHead;

            preTail = curHead;
            curHead = nextHead;
            curTail = nextHead;
        }

        return head;

    }
    private ListNode reverse(ListNode head)
    {
        ListNode preNode = null;
        ListNode curNode = head;

        ListNode nextNode = head;

        while(curNode != null)
        {
            nextNode = nextNode.next;

            curNode.next = preNode;

            preNode = curNode;
            curNode = nextNode;
        }
        return preNode;
    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
