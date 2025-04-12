//Optimal Solution for Missing number
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actual_sum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int missing_no=actual_sum-sum;
        return missing_no;
    }
}

//Brute force solution
 public static int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean f = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    f = true;
                    break;
                }
            }
            if (f==false) {
                return i;
            }
        }
        return -1;
    }
