
// LeetCode : https://leetcode.com/problems/merge-nodes-in-between-zeros/


public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode currentNew = dummy;
        ListNode currentOld = head.next;

        int sum = 0;

        while(currentOld != null){

            if(currentOld.val == 0){
                if(sum != 0){
                    currentNew.next = new ListNode(sum);
                    currentNew = currentNew.next;
                    sum = 0;
                }
            }
            else{
                sum += currentOld.val;
            }

            currentOld = currentOld.next;
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
