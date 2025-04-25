//Spiral Matrix Problem's solution
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length; 
        int top=0,bottom=m-1, left=0, right=n-1;

        ArrayList<Integer>li=new ArrayList<>();

        while(top<=bottom && left<=right){
            //right
            for(int i=left; i<=right;i++){
                li.add(matrix[top][i]);
            }
            top++;

            //bottom
            for(int i=top;i<=bottom;i++){
                li.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                //left
                for(int i=right;i>=left;i--){
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                //top
                for(int i=bottom;i>=top;i--){
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        return li;
        
    }
}
