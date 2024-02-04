
// LeetCode
// problem Link : https://www.codingninjas.com/studio/problems/insert-node-at-the-beginning_8144739


public class InsertNodeAtTheBeginning {

    class Node {
        public int data;
        public Node next;
        public Node prev;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
            this.prev = next;
        }
    };

    public  Node insertAtFirst(Node list, int newValue) {
        // Write your code here
        return new Node(newValue,list);
    }
}
