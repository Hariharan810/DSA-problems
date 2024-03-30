
// GFG Link: https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1


import java.util.Arrays;

public class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);

        if(size == 1)return a[0];

        int count = 1;
        int result = -1;

        int element = a[0];

        for(int i = 1; i < size; i++){

            if(element == a[i]){
                count++;
                if(count > size/2){
                    result = a[i];
                }
            }

            else{
                element = a[i];
                count = 1;
            }
        }

        return result;
    }
}
