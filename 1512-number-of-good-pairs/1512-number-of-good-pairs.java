class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
       for(int k:nums){
           hm.put(k,hm.getOrDefault(k,0)+1);
       }
        int c=0;
        for(int k:hm.keySet()){
            int n=hm.get(k);
            c+=n*(n-1)/2;
        }
        return c;
    }
}





//  int c=0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j])c++;
//             }
//         }
//         return c;