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
