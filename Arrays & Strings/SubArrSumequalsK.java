//Brute
class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int subarrsum=0;
            for(int j=i;j<nums.length;j++){
                subarrsum+=nums[j];
                if(subarrsum==k){
                    c++;
                }
            }
        }
        return c;
    }
}
