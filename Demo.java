import java.util.*;

public class Demo {
    public static void main(String[] args) {

        String arr[] = {"d","b","c","b","c","a"};

        int k = 2;

        Map<String,Integer> map = new HashMap<>();

        for(String str : arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        int count = 0;
        String result = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){

            int value = entry.getValue();

            if(value == 1){
                count++;
            }
            if(count == k){
                result += entry.getKey();
            }
        }

        if(count >= k) {
            System.out.println(result);
        }
        else {
            System.out.println("");
        }

//        return (count >= k) ? result : "" ;
    }

}


