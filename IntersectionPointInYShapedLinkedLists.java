
// GFG : https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1


import java.util.HashSet;

public class IntersectionPointInYShapedLinkedLists {
    int intersectPoint(Node head1, Node head2)
    {
        // code here
        Node temp1 = head1;

        HashSet<Node> set = new HashSet<>();

        while(temp1 != null){

            set.add(temp1);
            temp1 = temp1.next;
        }

        Node temp2 = head2;

        while(temp2 != null){
            if(set.contains(temp2)){
                return temp2.data;
            }
            temp2 = temp2.next;
        }
        return -1;
    }

    class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
}
