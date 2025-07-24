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
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int a=nums[i];
        if(hm.containsKey(target-a)){
            return new int[] {hm.get(target-a),i};
        }
        hm.put(a,i);
       }
        return new int[] {};
    }
}
