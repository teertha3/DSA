//brute
class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int hash[]={0,0,0};
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+hash[1]+hash[2]==3){
                    c++;
                }
            }
        }
        return c;
    }
}
//optimal
class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int lastseen[]={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
                c+=(1+Math.min(Math.min(lastseen[0],lastseen[1]),lastseen[2]));
            }
        }
        return c;
    }
}
