
// LeetCode
// problem Link : https://www.codingninjas.com/studio/problems/sort-linked-list-of-0s-1s-2s_1071937


public class SortLinkedListOf0s1s2s {


    public  Node sortList(Node head) {

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;

        while(temp!=null){

            if(temp.data==0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data==1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        one.next = twoHead.next;
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    class Node {
        public int data;
        public Node next;

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
