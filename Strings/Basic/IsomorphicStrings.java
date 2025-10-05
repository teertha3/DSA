class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s==null || t==null){
            return false;
        }
        int m1[]=new int[256];
        int m2[]=new int[256];
        int n=s.length();
        for(int i=0;i<n;i++){
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]){
                return false;
            }
            m1[s.charAt(i)]=i+1;
            m2[t.charAt(i)]=i+1;
        }
        return true;
    }
}
