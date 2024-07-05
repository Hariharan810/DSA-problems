import java.util.ArrayList;

public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode temp = head.next;
        int index = 1;

        ArrayList<Integer> criticalPoints = new ArrayList<>();

        while(temp != null && temp.next != null){
            if((temp.val > prev.val && temp.val > temp.next.val) ||
                    (temp.val < prev.val && temp.val < temp.next.val)){
                criticalPoints.add(index);
            }
            prev = temp;
            temp = temp.next;
            index++;
        }

        if(criticalPoints.size() < 2){
            return new int[]{-1,-1};
        }

        int min = Integer.MAX_VALUE;
        int max = criticalPoints.get(criticalPoints.size()-1)
                - criticalPoints.get(0);

        for(int i=1;i<criticalPoints.size();i++){
            min = Math.min(min,criticalPoints.get(i)
                    -criticalPoints.get(i-1));
        }

        return new int[]{min,max};
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
