//Brute
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int longest=1;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int c=1;
            while(search(nums,x+1)==true){
                x=x+1;
                c++;
            }
            longest=Math.max(longest,c);
        }
        return longest;
    }
    public static boolean search(int[] nums,int x){
        for(int num:nums){
            if(x==num){
                return true;
            }
        }
        return false;
    }
}

//Better
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int longest=1;
        int lastSmaller=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmaller){
                cnt++;
                lastSmaller=nums[i];
            }
            else if(nums[i]!=lastSmaller){
                cnt=1;
                lastSmaller=nums[i];
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}

//Optimal
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int longest=1;
        HashSet<Integer>hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int num:hs){
            if(!hs.contains(num-1)){
                int x=num;
                int c=1;
                while(hs.contains(x+1)){
                    c++;
                    x++;
                }
                longest=Math.max(longest,c);
            }
        }
        return longest;
    }
}
