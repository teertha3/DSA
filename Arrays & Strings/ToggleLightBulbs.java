// You are given an array bulbs of integers between 1 and 100.
// There are 100 light bulbs numbered from 1 to 100. All of them are switched off initially.
// For each element bulbs[i] in the array bulbs:
// If the bulbs[i]th light bulb is currently off, switch it on.
// Otherwise, switch it off.
// Return the list of integers denoting the light bulbs that are on in the end, sorted in ascending order. If no bulb is on, return an empty list.©leetcode
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        if(bulbs.size()==1){
            return bulbs;
        }
       Set<Integer>bu=new HashSet<>();
        for(int bulb:bulbs){
            if(bu.contains(bulb)){
                bu.remove(bulb);
            }
            else{
                bu.add(bulb);
            }
        }
        List<Integer>li=new ArrayList<>(bu);
        Collections.sort(li);
        return li;
    }
}
