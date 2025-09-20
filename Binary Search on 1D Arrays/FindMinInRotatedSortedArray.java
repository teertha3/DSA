class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+((high-low)/2);
            //if left half is sorted
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]); 
                low=mid+1; // eliminate left half after taking min from this part
            }
            //if right half is sorted
            else{
                ans=Math.min(ans,nums[mid]); 
                high=mid-1; //eliminate right half 
            }
        }
        return ans;
        
    }
}
