
// LeetCode : https://leetcode.com/problems/replace-words/


import java.util.ArrayList;
import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {

        String[] a = sentence.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (String i: a) {
            List<String> dict = new ArrayList<>();
            for (String t: dictionary) {
                if(i.startsWith(t)) {
                    i = t;
                    dict.add(t);
                }
            }
            if(dict.size() > 1) {
                int len = 1000;
                String ans = "";
                for (String z : dict) {
                    if(z.length() < len) {
                        ans = z;
                        len = z.length();
                    }
                }
                sb.append(ans + " ");
            } else {
                sb.append(i + " ");
            }
        }
        return sb.toString().trim();
    }
}
