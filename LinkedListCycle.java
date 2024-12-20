
// LeetCOde
// Problem Link : https://leetcode.com/problems/linked-list-cycle/


public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){

            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;

    }


    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
