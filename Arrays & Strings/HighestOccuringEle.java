//Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. 
//If there are multiple elements that appear a maximum number of times, find the smallest of them.
class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int min=Integer.MAX_VALUE,maxf=0;
        for(int key:hm.keySet()){
            int freq=hm.get(key);
            if(freq>maxf){
                maxf=freq;
                min=key;
            }
            else if(freq==maxf){
                min=Math.min(min,key);
            }
        
        }
        return min;
    }
}


