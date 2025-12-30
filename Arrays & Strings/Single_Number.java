//brute force -- O(N*N)
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
       for(int i=0;i<nums.length;i++){
        int c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                c++;
            }
        }
        if(c==1){
            ans=nums[i];
            break;
        }
       }
       return ans;
    }
}
//better (using hashmap) -- O(N+N)
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       for(int key:hm.keySet()){
        if(hm.get(key)==1){
            ans=key;
            break;
        }
       }
       return ans;
    }
}
//optimal (using bitmanipulation) -- O(N)
class Solution {
    public int singleNumber(int[] nums) {
       int ans=0;
       for(int i=0;i<nums.length;i++){
        ans=ans^nums[i];
       }
       return ans;
    }
}
