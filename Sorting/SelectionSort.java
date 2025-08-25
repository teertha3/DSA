class Solution {
    public int[] selectionSort(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(nums[minpos]>nums[j]){
                    minpos=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minpos];
            nums[minpos]=temp;
        }
        return nums;
    }
}
