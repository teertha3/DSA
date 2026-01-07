class Solution {
    public int maxSubArrayLen(int target, int[] nums) {
       int l=0,r=0,sum=0,maxlen=0;
       int n=nums.length;
       while(r<n){
        sum+=nums[r];
        while(sum>target){
            sum-=nums[l];
            l++;
        }
        if(sum<=target){
          maxlen=Math.max(maxlen,r-l+1);
          r++;
        }
       }
        return maxlen;
    }
}
