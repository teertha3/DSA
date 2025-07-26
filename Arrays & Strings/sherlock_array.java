public static String balancedSums(List<Integer> arr) {
        int n=arr.size();
        int prefix[]=new int[n];
        prefix[0]=arr.get(0);
        for(int i=1;i<n;i++){
            prefix[i]=arr.get(i)+prefix[i-1];
        }
        int suffix[]=new int[n];
        suffix[n-1]=arr.get(n-1);
        for(int i=n-2;i>=0;i--){
            suffix[i]=arr.get(i)+suffix[i+1];
        }
        for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i]){
                return "YES";
            }
        }
        return "NO";
}
