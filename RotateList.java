
// LeetCode
// problem Link : https://leetcode.com/problems/reverse-nodes-in-k-group/


public class RotateList {


    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k == 0)return head;

        ListNode tail = head;
        int len = 1;

        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        if(k%len == 0)return head;

        k = k%len;

        tail.next = head;
        ListNode newLastNode = findLastNode(head,len-k);

        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }

    public static ListNode findLastNode(ListNode temp,int k){

        int count = 1;

        while(temp!=null){
            if(count==k){
                return temp;
            }
            count++;
            temp = temp.next;
        }
        return temp;
    }



    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
