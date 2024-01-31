import java.util.HashMap;

class ArraySubsetofAnotherArray {
    public String isSubset( long a1[], long a2[], long n, long m) {
        boolean result = isSubset(a1, a2); 
        String finalResult;
        if (result) {
            finalResult="Yes";
        } else {
            finalResult="No";
        }
        return finalResult;
    }
    
    public static boolean isSubset(long[] arr1, long[] arr2) {
        HashMap<Long, Integer> frequencyMap = new HashMap<>();

        for (long num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (long num : arr2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) <= 0) {
                return false;
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }

        return true;
    }
}
