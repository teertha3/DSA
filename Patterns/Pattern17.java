/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/
class Solution {
    public void pattern17(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //characters- increasing sequence
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+j-1));
                
            }
            //characters- decreasing sequence
            for(int j=i-1;j>=1;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}
