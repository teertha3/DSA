class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                //shrink the search space
                low++;
                high--;
                continue;
            }
            //left half sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1; //eliminate right half
                }
                else{
                    low=mid+1;
                }
            }
            //right half sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1; //eliminate left half
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
