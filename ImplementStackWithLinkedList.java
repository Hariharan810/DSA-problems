
// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/implement-stack-with-linked-list_1279905



public class ImplementStackWithLinkedList {


    static class Stack {
        Node head;

        Stack()
        {
            head=null;
        }

        int getSize()
        {
            Node temp = head;
            int count = 0;
            while(temp!=null){
                temp = temp.next;
                count++;
            }
            return count;
        }

        boolean isEmpty()
        {
            if(head==null)return true;
            return false;
        }

        void push(int data)
        {
            Node temp = new Node(data);
            if(head==null)head = temp;
            else{
                temp.next=head;
                head = temp;
            }
        }

        void pop()
        {
            if(head==null)return;
            head=head.next;
        }

        int getTop()
        {
            if(head==null)return -1;
            return head.data;
        }
    }

    static class Node
    {
        int data;
        Node next;
        Node()
        {
            this.data = 0;
            this.next = null;
        }
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
