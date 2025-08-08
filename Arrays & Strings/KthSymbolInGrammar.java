//Brute force
class Solution {
    public int kthGrammar(int n, int k) {
        StringBuilder row=new StringBuilder("0");
        for(int i=1;i<n;i++){
            StringBuilder nextrow=new StringBuilder(row.length()*2);
            for(int j=0;j<row.length();j++){
                if(row.charAt(j)=='0'){
                    nextrow.append("01");
                }
                else{
                    nextrow.append("10");
                }
            }
            row=nextrow;
        }
        return row.charAt(k-1)-'0';
        
    }
}
