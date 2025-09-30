//Brute
class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            return -1;
        }
        int max=Integer.MIN_VALUE; // starting range - max(arr)
        int sum=0;
        for(int num:nums){
            sum+=num;
            max=Math.max(max,num);
        }
        for(int largestsum=max;largestsum<=sum;largestsum++){
            int cntsubarr=funtocntsubarr(nums,largestsum);
            if(cntsubarr<=k){
                return largestsum;
            }
        }
        return -1;
    }
    public static int funtocntsubarr(int nums[],int maxSum){
        int subarr=1, sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=maxSum){
                sum+=nums[i];
            }
            else{
                subarr++;
                sum=nums[i];
            }
        }
        return subarr;
    }

}
//Optimal
class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            return -1;
        }
        int max=Integer.MIN_VALUE; // starting range - max(arr)
        int sum=0;
        for(int num:nums){
            sum+=num;
            max=Math.max(max,num);
        }
        int low=max,high=sum,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int cntsubarr=funtocntsubarr(nums,mid);
            if(cntsubarr<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int funtocntsubarr(int nums[],int maxSum){
        int subarr=1, sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=maxSum){
                sum+=nums[i];
            }
            else{
                subarr++;
                sum=nums[i];
            }
        }
        return subarr;
    }

}

