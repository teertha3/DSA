//Brute
class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if((i==0 || nums[i]>nums[i-1])&& (i==nums.length-1 || nums[i]>nums[i+1])){
                return i;
            }
        }
        return -1;
        
    }
}
//Optimal 
class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int low=1,high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            //left part is in increasing order & peak is on right
            else if(nums[mid]>nums[mid-1]){
                low=mid+1; //eliminate left
            }
            else{
                high=mid-1; //eliminate right
            }
        }
        return -1;
        
    }
}
