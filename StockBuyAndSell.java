
// GFG : https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1

import java.util.ArrayList;

public class StockBuyAndSell {

    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        // code here

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int buyIndex = 0;
        int sellIndex =0;

        for(int i =0 ;i< n-1 ; i++){
            if(A[i] < A[i+1]){
                sellIndex++;
            }
            else{
                if(buyIndex != sellIndex){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(buyIndex);
                    al.add(sellIndex);
                    result.add(al);
                }
                buyIndex = i+1;
                sellIndex = i+1;
            }
        }

        if(buyIndex != sellIndex){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(buyIndex);
            al.add(sellIndex);
            result.add(al);
        }
        return result;
    }
}
