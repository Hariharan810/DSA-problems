
// LeetCode
// problem Link : https://leetcode.com/problems/add-two-numbers/


public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;

        while(temp1!=null || temp2!=null){

            int sum = carry;

            if(temp1!=null) sum+=temp1.val;
            if(temp2!=null) sum+=temp2.val;

            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;

            current.next = newNode;
            current = newNode;

            if(temp1!=null)temp1=temp1.next;
            if(temp2!=null)temp2=temp2.next;
        }

        if(carry==1){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }
        return dummyNode.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
