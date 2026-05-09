/* Given an integer n. You need to recreate the pattern given below for any value of N.
Let's say for N = 5, the pattern should look like as below:
1        1
12      21
123    321
1234  4321
1234554321
*/
class Solution {
    public void pattern12(int n) {
        for(int i=1;i<=n;i++){
            //left side
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //right side
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
