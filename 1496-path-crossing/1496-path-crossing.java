class Solution {
    public boolean isPathCrossing(String path) {
        
        HashMap<Character,Pair<Integer,Integer>> hm=new HashMap<>();
        
        hm.put('E',new Pair(1,0));
        hm.put('W',new Pair(-1,0));
        hm.put('N',new Pair(0,1));
        hm.put('S',new Pair(0,-1));
        
        Set<Pair<Integer,Integer>>visited=new HashSet<>();
        visited.add(new Pair(0,0));
        
        int x=0,y=0;
        
        for(char c:path.toCharArray()){
            Pair<Integer,Integer>cur=hm.get(c);
            x+=cur.getKey();
            y+=cur.getValue();
            Pair<Integer,Integer>newPair=new Pair(x,y);
            
            if(visited.contains(newPair)){
                return true;
            }
            visited.add(newPair);
            
        }
        return false;
        
    }
}