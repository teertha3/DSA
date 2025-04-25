//Minimum time visiting all points
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length,res=0;
        for(int i=1;i<n;i++){
            int xd=Math.abs(points[i][0]-points[i-1][0]);
            int yd=Math.abs(points[i][1]-points[i-1][1]);
            res+=Math.max(xd,yd);
        }
        return res;
    }
}
