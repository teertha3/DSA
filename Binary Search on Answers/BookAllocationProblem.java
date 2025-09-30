//brute
class Solution {
    public int findPages(int[] nums, int m) {
        int n=nums.length;
        if(m>n){
            return -1;
        }
        int min=Integer.MIN_VALUE; // starting range - max(arr)
        int sum=0;
        for(int num:nums){
            sum+=num;
            min=Math.max(min,num);
        }
        for(int pages=min;pages<=sum;pages++){
            int cntStud=funtocntalloc(nums,pages);
            if(cntStud<=m){
                return pages;
            }
        }
        return -1;

    }
    public static int funtocntalloc(int nums[],int maxpages){
        int stu=1,pages=0;
        for(int i=0;i<nums.length;i++){
            if(pages+nums[i]<=maxpages){
                pages+=nums[i];
            }
            else{
                stu++;
                pages=nums[i];
            }
        }
        return stu;
    }
}
//Optimal
class Solution {
    public int findPages(int[] nums, int m) {
        int n=nums.length;
        if(m>n){
            return -1;
        }
        int min=Integer.MIN_VALUE; // starting range - max(arr)
        int sum=0;
        for(int num:nums){
            sum+=num;
            min=Math.max(min,num);
        }
        int low=min,high=sum,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(funtocntalloc(nums,mid)<=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static int funtocntalloc(int nums[],int maxpages){
        int stu=1,pages=0;
        for(int i=0;i<nums.length;i++){
            if(pages+nums[i]<=maxpages){
                pages+=nums[i];
            }
            else{
                stu++;
                pages=nums[i];
            }
        }
        return stu;
    }
}
