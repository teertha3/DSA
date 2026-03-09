//Brute
class Solution {
    public int totalFruits(int[] fruits) {
        int max=0;
        for(int i=0;i<fruits.length;i++){
            HashSet<Integer>hs=new HashSet<>();
            for(int j=i;j<fruits.length;j++){
                hs.add(fruits[j]);
                if(hs.size()>2){
                    break;
                }
                max=Math.max(max,j-i+1);
                
            }
        }
        return max;
    }
}

//optimal
class Solution {
    public int totalFruits(int[] fruits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int l=0,r=0,max=0;
        while(r<fruits.length){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
