//brute force
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    c++;
                }
            }
        }
        return c;
    }
}
//optimal
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subarraywithsum(nums,goal)-subarraywithsum(nums,goal-1);
    }
    public static int subarraywithsum(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int l=0,r=0;
        int sum=0,c=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
}
