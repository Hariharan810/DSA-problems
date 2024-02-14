
// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/add-one-to-a-number-represented-as-linked-list_920557


public class AddOneToANumberRepresentedAsLinkedList {

    public  Node addOne(Node head) {

        int carry = helper(head);

        if(carry==1){
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    public static int helper(Node head){

        Node temp = head;

        if(temp==null){
            return 1;
        }

        int carry = helper(temp.next);

        temp.data+=carry;

        if(temp.data < 10){
            return 0;
        }
        temp.data = 0;
        return 1;
    }


    class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
