class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int r=search(matrix[i],target);
            if(r!=-1){
                return true;
            }
        }
        return false;
    }
    public static int search(int[] matrix,int target){
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid]==target){
                return mid;
            }
            else if(matrix[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
