/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:
  
    *
   ***
  *****
 *******
********* 

*/
class Solution {
    public void pattern7(int n) {
        for(int i=1;i<=n;i++){
            //to print spaces in each row
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //to print stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
