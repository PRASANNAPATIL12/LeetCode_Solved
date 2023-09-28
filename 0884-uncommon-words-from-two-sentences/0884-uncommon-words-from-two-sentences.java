class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String ,Integer>hm=new HashMap<>();
        String combine=s1+" "+s2;
        for(String i:combine.split(" ")){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<String > l=new ArrayList<>();
        for(String ch:hm.keySet()){
            if(hm.get(ch)==1)l.add(ch);
        }
        return l.toArray(new String[0]);
    //    String res[]=new String[l.size()];
    //     for(int i=0;i<l.size();i++){
    //         res[i]=l.get(i);
    //     }
    //     return res;
        
    }
}