//Two sum problem brute force solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}

// optimal solution
public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            int c= target - nums[i];
            if (hm.containsKey(c)) {
                return new int[] { hm.get(c), i };
            }
            hm.put(nums[i], i);
        }
        return new int[] {}; 
    }
