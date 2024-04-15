
// GFG: https://practice.geeksforgeeks.org/problems/count-the-elements/0


import java.util.ArrayList;

public class CountTheElements {
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<q;i++){
            int temp = largerElements(a,b,query[i]);
            result.add(temp);
        }

        int[] arr = new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i] = result.get(i);
        }

        return arr;
    }

    public static int largerElements(int[] a,int[] b,int num){

        int count = 0;

        for(int i=0;i<b.length;i++){
            if(b[i] <= a[num])count++;
        }

        return count;
    }
}
