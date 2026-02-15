class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer>cfreq=new HashMap<>();
        for(int cnt:hm.values()){
            cfreq.put(cnt,cfreq.getOrDefault(cnt,0)+1);
        }
        for(int num:nums){
            if(cfreq.get(hm.get(num))==1){
                return num;
            }
        }
        return -1;
    }
}
