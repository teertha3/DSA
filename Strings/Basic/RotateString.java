//Brute force
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            String str=s.substring(i)+s.substring(0,i);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
//Optimal
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String str=s+s;
        if(str.contains(goal)){
            return true;
        }
        return false;
    }
}
