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

//Optimal (using recursion)
class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1 && k==1){
            return 0;
        }
        int mid=(int)Math.pow(2,(n-2));
        if(k<=mid){
            return kthGrammar(n-1,k);
        }
        else{
            return 1-kthGrammar(n-1,k-mid);
        }
    }
}
