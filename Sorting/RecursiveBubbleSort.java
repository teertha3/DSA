class Solution {
    public int[] bubbleSort(int[] nums) {
        int n=nums.length;
        bubble_sort(nums,n);
        return nums;
    }
    public static void bubble_sort(int[] nums,int n){
        if(n==1){
            return;
        }
        //single pass
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        bubble_sort(nums,n-1);

    }
}
