class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>>li=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int key:hm.keySet()){
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(key);
            temp.add(hm.get(key));
            li.add(temp);
        }
        return li;
    }
}
