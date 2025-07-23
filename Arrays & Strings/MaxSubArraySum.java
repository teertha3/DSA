//Using Kadane's algorithm --- O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            maxsum=Math.max(cs,maxsum);
            if(cs<0){
                cs=0;
            }
        }
        return maxsum;
        
    }
}

//Brute force --- O(n^2)
class Solution {
  public int maxSubArray(int[] nums){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            int cs=0;
            for(int e=i;e<nums.size();e++){
                cs+=nums[e];
                maxsum=Math.max(cs,maxsum);
            }
        }
        return maxsum;   
    }
}
