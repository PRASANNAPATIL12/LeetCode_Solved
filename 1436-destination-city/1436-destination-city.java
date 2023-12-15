class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs=new HashSet<>();
        String res="";
        for(List<String> path:paths){
            hs.add(path.get(0));
        }
        for(List<String> path:paths){
            if(!hs.contains(path.get(1))){
            res= path.get(1).toString();
            }
        }
        
        return res;
    }
}