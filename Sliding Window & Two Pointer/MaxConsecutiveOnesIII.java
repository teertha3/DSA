//Brute force
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    c++;
                }
                if(c<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
}

//Optimal
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int maxlen=0,c=0;
        while(r<nums.length){
            if(nums[r]==0){
                c++;
            }
            while(c>k){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            if(c<=k){
                maxlen=Math.max(r-l+1,maxlen);
            }
            r++;
        }
        return maxlen;
    }
}
