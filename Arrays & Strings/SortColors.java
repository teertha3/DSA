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
