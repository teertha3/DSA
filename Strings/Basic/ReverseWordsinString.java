class Solution {
    public String reverseWords(String s) {
        s=s.trim(); //removes leading and trailing spaces
        String[] str=s.split("\\s+"); //split by one/more spaces
        int low=0,high=str.length-1;
        while(low<=high){
            String temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            high--;
            low++;
        }
        String res=String.join(" ",str);
        return res;
    }
}
