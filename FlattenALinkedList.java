

// Coding Ninjas
// problem Link : https://www.codingninjas.com/studio/problems/flatten-a-linked-list_1112655



public class FlattenALinkedList {

    private  Node mergeTwoLists(Node list1, Node list2){


        if(list1.data <= list2.data) list2.next = null;

        else list1.next = null;

        Node dummyNode = new Node(-1);

        Node res = dummyNode;



        while(list1 != null && list2 != null){

            if(list1.data < list2.data ){

                res.child = list1;

                res = list1;

                list1 = list1.child;

            }

            else{

                res.child = list2;

                res = list2;

                list2 = list2.child;

            }

            res.next = null;

        }



        if(list1 != null) res.child = list1;

        if(list2 != null) res.child = list2;



        if(dummyNode.child != null) dummyNode.child.next = null;

        return dummyNode.child;

    }

    public  Node flattenLinkedList(Node head) {

        //Write your code here

        if(head == null || head.next == null) return head;

        Node mergedHead = flattenLinkedList(head.next);

        return mergeTwoLists(head, mergedHead);



    }


    class Node {
        public int data;
        public Node next;
        public Node child;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.child = null;
        }
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.child = null;
        }
        Node(int data, Node next, Node child)
        {
            this.data = data;
            this.next = next;
            this.child = child;
        }
    }

}
