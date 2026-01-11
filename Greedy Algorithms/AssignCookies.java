class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int l=0,r=0;
        while(l<s.length && r<g.length){
            if(s[l]>=g[r]){
                c++;
                l++;
                r++;
            }
            else{
                l++;
            }
        }
        return c;
    }
}
