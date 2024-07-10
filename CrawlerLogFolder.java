
// LeetCode : https://leetcode.com/problems/crawler-log-folder/


public class CrawlerLogFolder {
    public int minOperations(String[] logs) {


        int result = 0;

        for(String log:logs){
            if(log.equals("../")){
                if(result > 0){
                    result--;
                }
            }
            else if(!log.equals("./")){
                result++;
            }
        }
        return result;

    }
}
