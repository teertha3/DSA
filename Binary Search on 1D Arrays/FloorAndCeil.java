class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int res[]=new int[2];
        int n=nums.length;
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        int floor=getFloor(nums,low,high,x);
        int ceil=getCeil(nums,low,high,x);
        res[0]=floor;
        res[1]=ceil;
        return res;
           
    }
    public static int getCeil(int[] nums,int low,int high,int x){
         int ans=-1;
         while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>=x){
                ans=nums[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
     public static int getFloor(int[] nums,int low,int high,int x){
         int ans=-1;
         while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]<=x){
                ans=nums[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
