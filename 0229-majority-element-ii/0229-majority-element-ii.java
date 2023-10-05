class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int k:nums){
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int d=nums.length/3;
        for(int k:hm.keySet()){
            if(hm.get(k)>d)
                l.add(k);
        }
        return l;
    }
}