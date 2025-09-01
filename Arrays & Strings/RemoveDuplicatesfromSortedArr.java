//Brute force- Using a set
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
                set.add(nums[i]);
        }
        int k=set.size();
        int j=0;
        for(int num:set){
            nums[j++]=num;
        }
        return k;
    }
}

//Optimal- Two pointer approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
