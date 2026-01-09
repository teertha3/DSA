//brute
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int l=0,r=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            if(hm.containsKey(c)){
                l=Math.max(l,hm.get(c)+1);
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hm.put(c,r);
            r++;
        }
        return maxlen;
    }
}
//optimal
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int l=0,r=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            if(hm.containsKey(c)){
                l=Math.max(l,hm.get(c)+1);
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hm.put(c,r);
            r++;
        }
        return maxlen;
    }
}
