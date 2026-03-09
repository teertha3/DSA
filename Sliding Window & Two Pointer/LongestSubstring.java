class Solution {
    public String lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int l=0,r=0,si=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(r<s.length()) {
            char c=s.charAt(r);
            if(hm.containsKey(c)) {
                l=Math.max(l,hm.get(c)+1);
            }
            int len=r-l+1;
            if(len>maxlen) {
                maxlen=len;
                si=l;
            }
            hm.put(c,r);
            r++;
        }
        return s.substring(si,si+maxlen);
    }
}
