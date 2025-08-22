class Solution {
    public int countDigit(int n) {
        int c=0;
        while(n>0){
            int digit=n%10;
            c++;
            n/=10;
        }
        return c;
    }
}
