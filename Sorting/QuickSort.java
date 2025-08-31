class Solution {
    public int[] quickSort(int[] nums) {
        int low=0;
        int high=nums.length-1;
        quick_sort(nums,low,high);
        return nums;
    }
    public static void quick_sort(int[] nums,int low,int high){
        if(low<high){
            int partitionIndex=pivotfun(nums,low,high);
            quick_sort(nums,low,partitionIndex-1);
            quick_sort(nums,partitionIndex+1,high);
        }
    }
    public static int pivotfun(int[] nums,int low,int high){
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(nums[i]<=pivot && i<=high-1){
                i++;
            }
            while(nums[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }

        }
        int temp=nums[low];
        nums[low]=nums[j];
        nums[j]=temp;
        return j;
    }
}
