//Find all numbers disappeared
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]>0){
                nums[ind]=-nums[ind];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                li.add(i+1);

            }
        }
        return li;
    }
}
