class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
                if(c>1){
                    res.append('(');
                }
            }
            else{
                c--;
                if(c>0){
                res.append(')');
                }
            }
        }
        return res.toString();
    }
}
