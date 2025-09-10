//Iterative
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
//Recursive
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        return binarySearch(nums,target,low,high);

    }
    public static int binarySearch(int[] nums,int target,int low,int high){
            if(low>high){
                return -1;
            }
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                return binarySearch(nums,target,mid+1,high);
            }
            
        return binarySearch(nums,target,low,mid-1);
    
    }
}
