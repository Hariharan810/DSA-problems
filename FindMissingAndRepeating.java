
// GFG : https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1


public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        // code here

        int[] answer = new int[]{-1, -1};

        int value, element;

        for (int i = 0; i < n; i++) {
            value = Math.abs(arr[i]);
            element = arr[value - 1];
            if (element > 0) {
                arr[value - 1] = -element;
            } else {
                answer[0] = value;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                answer[1] = i + 1;
                break;
            }
        }

        return answer;
    }
}
