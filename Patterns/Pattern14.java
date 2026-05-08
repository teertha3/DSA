/*Let's say for N = 5, the pattern should look like as below:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
class Solution {
    public void pattern14(int n){

        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c=(char)(c+1);
            }
            System.out.println();
        }
    }
}
