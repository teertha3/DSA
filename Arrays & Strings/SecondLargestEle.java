//brute force
class Solution {
    public int secondLargestElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int largest=nums[n-1];
        int seclargest=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=largest){
                seclargest=nums[i];
                break;
            }
        }
        return seclargest;
    }
}


//better
class Solution {
    public int secondLargestElement(int[] nums) {
        int n=nums.length;
        int largest=nums[0];
        int seclargest=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        for(int i=0;i<n;i++){
          if(nums[i]!=largest && nums[i]>seclargest){
            seclargest=nums[i];
          }
        }
        return seclargest;
    }
}

//optimal
class Solution {
    public int secondLargestElement(int[] nums) {
        int n=nums.length;
        int largest=nums[0];
        int seclargest=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                seclargest=largest;
                largest=nums[i];
            }
            else if(nums[i]<largest && nums[i]>seclargest){
                seclargest=nums[i];
            }
        }
        return seclargest;
    }
}
