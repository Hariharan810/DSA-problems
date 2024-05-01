
// GFG : https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1


import java.util.Stack;

public class CheckIfLinkedListIsPalindrome {
    boolean isPalindrome(Node head)
    {
        //Your code here
        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        while(temp != null){

            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){

            if(temp.data != stack.peek()){
                return false;
            }

            temp = temp.next;
            stack.pop();
        }

        return true;
    }
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
}
