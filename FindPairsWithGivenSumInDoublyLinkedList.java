
// LeetCode
// problem Link : https://www.codingninjas.com/studio/problems/find-pairs-with-given-sum-in-doubly-linked-list_1164172



import java.util.ArrayList;

public class FindPairsWithGivenSumInDoublyLinkedList {


    public static ArrayList<Integer[]> findPair(Node<Integer> head, int k) {

        ArrayList<Integer[]> pairs = new ArrayList<>();

        Node<Integer> left = head;
        Node<Integer> right = findTail(head);

        while (left.data < right.data) {

            if (left.data + right.data == k) {
                pairs.add(new Integer[]{left.data, right.data});
            } else if (left.data + right.data < k) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return pairs;
    }

    public static Node findTail(Node head) {

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }


    class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
        }
    }
}
