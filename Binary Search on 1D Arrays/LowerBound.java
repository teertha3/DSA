//Brute
class Solution {
    public int lowerBound(int[] nums, int x) {
        int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]>=x){
            return i;
        }
       }
       return n;
    }
}
//BS - Iterative
class Solution {
    public int lowerBound(int[] nums, int x) {
        int n=nums.length;
       int ans=n;
       int low=0;
       int high=n-1;
       while(low<=high){
        int mid=low+((high-low)/2);
        if(nums[mid]>=x){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
}
//BS - Recursive
class Solution {
    public int lowerBound(int[] nums, int x) {
       int n=nums.length;
       int low=0;
       int high=n-1;
       return BS(nums,x,low,high);
    }
    public int BS(int[] nums,int x,int low,int high){
        if(low>high){
            return nums.length;
        }
        int mid=low+((high-low)/2);
        if(nums[mid]>=x){
            return Math.min(mid,BS(nums,x,low,mid-1));
        }
            
        return BS(nums,x,mid+1,high);
    }
}

