// User function Template for Java

class Sol {
    int getCount(String S, int N) {
        int cnt=0;
        int freq[]=new int[26];
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(i==0 || c!=S.charAt(i-1)){
                freq[c-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]==N){
                cnt++;
            }
        }
        return cnt;
    }
}
