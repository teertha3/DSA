//Using hashset
class Solution {
    public int singleNumber(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int num:nums){
        if(set.contains(num)){
            set.remove(num);
        }
        else{
            set.add(num);
        }
       }
       int ans=0;
       for(int num:set){
        ans=num;
       }
       return ans;
    }
}

//optimal - space: O(1)
class Solution {
    public int singleNumber(int[] nums) {
      int ans=0;
      for(int i=0;i<nums.length;i++){
        ans=ans^nums[i];
      }
       return ans;
    }
}
