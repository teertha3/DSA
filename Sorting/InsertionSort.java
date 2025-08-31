class Solution {
    public int[] insertionSort(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev>=0 && curr<nums[prev]){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }
        return nums;
    }
}

//recursion
class Solution {
    public int[] insertionSort(int[] nums) {
        insertion_sort(nums,0,nums.length);
        return nums;
    }
    public static void insertion_sort(int[] nums,int i,int n){
        if(i==n){
            return;
        }
        int j=i;
        while(j>0 && nums[j-1]>nums[j]){
            int temp=nums[j-1];
            nums[j-1]=nums[j];
            nums[j]=temp;
            j--;
        }
        insertion_sort(nums,i+1,n);
    }
}
