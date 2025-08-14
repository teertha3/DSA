public class Solution {
    public int solve(int[] A) {
        HashSet<Integer>hs=new HashSet<>();
        int fr=-1;
        for(int i=A.length-1;i>=0;i--){
            if(hs.contains(A[i])){
                fr=A[i];
            }
            else{
            hs.add(A[i]);
            }
        }
        return fr;
    }
}
