class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
             hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Character>chars=new ArrayList<>(hm.keySet());
        Collections.sort(chars,(a,b)->hm.get(b)-hm.get(a));
        StringBuilder res=new StringBuilder();
        for(char c:chars){
            int cnt=hm.get(c);
            for(int i=0;i<cnt;i++){
                res.append(c);
            }
        }
        return res.toString();
    }
}
