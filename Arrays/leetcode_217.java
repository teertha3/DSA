//optimal solution for 'contains duplicates'
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet <Integer> s=new HashSet<>();
       for(int n :nums){
        if(s.contains(n)){
            return true;
        }
        s.add(n);
       }
       return false;
    }
}

//Brute force solution
public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true; 
                }
            }
        }
        return false; 
    }
