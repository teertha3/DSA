class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            set.add(num);
        }
        int[] res=new int[set.size()];
        int i=0;
        for(int num:set){
            res[i++]=num;
        }
        Arrays.sort(res);
        return res;
    }
}
