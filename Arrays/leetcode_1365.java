//How Many Numbers Are Smaller Than the Current Number
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    c+=1;
                }
                res[i]=c;
            }
        }
        return res;
        
    }
}
