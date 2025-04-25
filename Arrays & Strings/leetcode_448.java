//Find all numbers disappeared

//negative marking approach
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

//using hashset
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
