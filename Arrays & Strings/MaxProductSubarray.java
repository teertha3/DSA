//Brute
class Solution {
    public int maxProduct(int[] nums) {
        int lp=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums.length==1){
                return nums[i];
            }
            int cp=1;
            for(int j=i;j<nums.length;j++){
                cp*=nums[j];
                lp=Math.max(lp,cp);
            }

        }
        return lp;
    }
}
//Optimal
class Solution {
    public int maxProduct(int[] nums) {
        int lp=nums[0];
        int currmax=nums[0];
        int currmin=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=currmax;
                currmax=currmin;
                currmin=temp;
            }
            currmax=Math.max(curr,curr*currmax);
            currmin=Math.min(curr,curr*currmin);
            lp=Math.max(currmax,lp);

        }
        return lp;
    }
}
