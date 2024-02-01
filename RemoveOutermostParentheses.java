//LeetCode
//Problem Link : https://leetcode.com/problems/remove-outermost-parentheses/description/

class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        
        int len=s.length();
        if(len<=2) return "";

        char[] c=s.toCharArray();

        StringBuilder str=new StringBuilder();

        int open=1;

        for(int i=1;i<len;i++){
            if(c[i]=='('){
                open++;
                if(open>1){
                    str.append('(');
                }
            }
            else{
                if(open>1){
                    str.append(')');
                }
                open--;
            }
        }
        return str.toString();
    }
}
