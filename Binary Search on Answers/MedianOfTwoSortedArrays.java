//Brute force
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int nums3[]=new int[n1+n2];
        int i=0,j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                nums3[k++]=nums1[i];
                i++;
            }
            else{
                nums3[k++]=nums2[j];
                j++;
            }
        }
        while(i<n1){
            nums3[k++]=nums1[i++];
        }
        while(j<n2){
            nums3[k++]=nums2[j++];
        }
        int n3=nums3.length;
        if(n3%2==1){
            return nums3[n3/2];
        }
        return (double)((double)nums3[n3/2]+(double)nums3[(n3/2)-1])/2;
    }
}


