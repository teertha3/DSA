
class Solution {
    public void sortColors(int[] nums) {
        int cntzero=0;
        int cntone=0;
        int cnttwo=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cntzero++;
            }
            else if(nums[i]==1){
                cntone++;
            }
            else{
                cnttwo++;
            }
        }
        int index=0;
        for(int i=0;i<cntzero;i++){
            nums[index++]=0;
        }
        for(int i=0;i<cntone;i++){
            nums[index++]=1;
        }
        for(int i=0;i<cnttwo;i++){
            nums[index++]=2;
        }
        
    }
}

//Optimal
class Solution {
    public void sortColors(int[] nums) {
       int low=0,mid=0;
       int high=nums.length-1;
       while(mid<=high){
        if(nums[mid]==0){
            int temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
        }
       }
        
    }
}


