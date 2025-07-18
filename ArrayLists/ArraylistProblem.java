// https://www.hackerrank.com/challenges/java-arraylist/problem
//Given n  lines. In each line there are zero or more integers. We need to answer a few queries where you need to tell the number located in yth  position of xth line.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        int n=sc.nextInt();
        for(int k=0;k<n;k++){
            ArrayList<Integer>l=new ArrayList<>();
            int d=sc.nextInt();
            for(int i=0;i<d;i++){
                int val=sc.nextInt();
                l.add(val);
            }
            li.add(l);
        }
        int q=sc.nextInt();
        for(int j=0;j<q;j++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(li.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
            
        }
    }
}
