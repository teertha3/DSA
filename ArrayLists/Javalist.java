//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>l=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            l.add(val);
        }
        int Q=sc.nextInt();
        for(int q=0;q<Q;q++){
            String s=sc.next();
            if(s.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                l.add(x,y); 
            }
            else{
                int x=sc.nextInt();
                l.remove(x);
            } 
        }
        for(int val:l){
            System.out.print(val+" ");
        
        }
        
    }
}
