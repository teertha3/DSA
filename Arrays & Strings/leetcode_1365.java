//How Many Numbers Are Smaller Than the Current Number

//Brute force approach
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

//count sort approach
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; 
        int[] res = new int[nums.length];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }
        return res;
    }
}
