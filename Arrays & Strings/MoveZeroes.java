//Brute force
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>li=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                li.add(nums[i]);
            
            }
        }
        int lisize=li.size();
        for(int i=0;i<lisize;i++){
            nums[i]=li.get(i);
        }
        for(int i=lisize;i<n;i++){
            nums[i]=0;
        }
    }
}

//optimal
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }

        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
