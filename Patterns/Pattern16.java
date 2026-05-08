/* Let's say for N = 5, the pattern should look like as below:
A
BB
CCC
DDDD
EEEEE
*/
class Solution {
    public void pattern16(int n) {
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            c=(char)(c+1);
            System.out.println();
        }
    }
}
