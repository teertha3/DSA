class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=maxNum(nums);
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            int val=sumFunction(nums,mid);
            if(val<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int maxNum(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
        }
        return max;
    }
    public static int sumFunction(int [] nums,int mid){
        int sum=0;
        for(int num:nums){
            sum+=Math.ceil((double)num/(double)mid);
        }
        return sum;
    }
}
