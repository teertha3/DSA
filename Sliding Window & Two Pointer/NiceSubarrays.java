class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         return subarraywithsum(nums,k)-subarraywithsum(nums,k-1);
    }
    public static int subarraywithsum(int nums[],int goal){
         if(goal<0){
            return 0;
        }
        int l=0,r=0;
        int sum=0,c=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>goal){
                sum=sum-(nums[l]%2);
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
}
