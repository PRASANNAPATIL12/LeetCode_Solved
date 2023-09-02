class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : nums) {
            h.put(n, h.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            pq.add(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}


// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         int a[]=new int [nums.length];
//         int i=0;
//         HashMap<Integer,Integer>h=new HashMap<>();
//         for(int p:nums){
//             if(h.contains(p)){
//                 h.put(p,h.get(p)+1);
//                 if(h.get(p)>k)a[i++]=p;
//             }
//             else
//                 h.put(p,1);
//         }
//         return a;
//     }
// }