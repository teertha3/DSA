import java.io.*;
import java.util.*;

public class Solution {
       static Stack<Integer>s1=new Stack<>();
       static Stack<Integer>s2=new Stack<>();
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int q=sc.nextInt();
       for(int Q=0;Q<q;Q++){
        int val=sc.nextInt();
        switch(val){
            case 1: int x=sc.nextInt();
                    s1.push(x);
            break;
            case 2: if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
        }
        if(!s2.isEmpty()){
               s2.pop();
        }
        
            break;
            case 3: 
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            if(!s2.isEmpty()){
                System.out.println(s2.peek());
            }
            
            break;
        }
       }
    }

}
