class Solution {
    public int maxDepth(String s) {
        int max=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
            }
            else if(s.charAt(i)==')'){
                c--;
            }
            max=Math.max(c,max);
        }
        return max;
    }

}
