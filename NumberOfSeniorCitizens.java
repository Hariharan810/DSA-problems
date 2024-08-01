
// LeetCode : https://leetcode.com/problems/number-of-senior-citizens/


public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {

        int count = 0;

        for(int i=0;i<details.length;i++){
            String str = details[i].substring(11,13);

            int age = Integer.parseInt(str);

            if(age > 60){
                count++;
            }
        }

        return count;
    }
}
