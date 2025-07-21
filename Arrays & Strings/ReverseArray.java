
public class ReverseArray {
    public static void main(String[] args) {
        int a[]={23,2,24,30,42,12};
        
        // Brute force
        int a1[]=new int[a.length];
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            a1[j]=a[i];
        }
        System.out.print("Reverse of array: ");
        for(int val:a1){
            System.out.print(val+" ");
        }
        System.out.println();
        
        //using two pointers
        int s=0,e=a.length-1;
        while(s<e){
            int temp=a[e];
            a[e]=a[s];
            a[s]=temp;
            s++;
            e--;
        }
        for(int val:a){
            System.out.print(val+" ");
        }

    }
}
